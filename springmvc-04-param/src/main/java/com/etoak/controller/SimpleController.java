package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simple")
public class SimpleController {
	@RequestMapping("/servlet")
	public String servlet(HttpServletRequest request) {
		String name = request.getParameter("name");
		if(StringUtils.isEmpty(name)) {
			name="World????";
		}
		request.setAttribute("result", "Hello"+name);
		return "param";
	}
	@RequestMapping(value="/simple" , method = {RequestMethod.GET})
	public ModelAndView simple(@RequestParam(required = false,defaultValue= "1") int id,String name) {
		System.out.println(id+name);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("param");
		mv.addObject("result","ModelAndView传值");
		return mv;
	}
}
