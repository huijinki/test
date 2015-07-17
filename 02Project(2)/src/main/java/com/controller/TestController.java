package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	String a;
	String ddd;
	@RequestMapping("/ajaxmain")
	public String aaa(){
		
		return "ajaxmain";
		
	
	}
	@RequestMapping("/ajaxdesign")
	public String bbb(){
		
		return "ajaxdesign";
		
	
	}
	@RequestMapping("/ajaxphotography")
	public String ccc(){
		
		return "ajaxphotography";
		
	
	}
	@RequestMapping("/ajaxvideo")
	public String ddd(){
		
		return "ajaxvideo";
		
	
	}
	
	@RequestMapping("/write")
	public String eee(){
		
		return "write";
		
	
	}

}
