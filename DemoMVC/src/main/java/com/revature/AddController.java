package com.revature;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.service.AddService;

@Controller
public class AddController 
{

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int t1 = Integer.parseInt(request.getParameter("t1"));
		int t2 = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int sum = as.add(t1, t2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);
		
		return mv;
	}
}