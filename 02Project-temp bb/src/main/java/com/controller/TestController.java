package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.entity.MemberDTO;
import com.service.MyService;

@Controller
public class TestController {
	
	MyService service;

	public void setService(MyService service) {
		this.service = service;
	}
	
	
	@RequestMapping("/register")
	public String register(MemberDTO dto){
		
		System.out.println(dto.getMember_id());
		System.out.println(dto.getMember_name());
		System.out.println(dto.getMember_passwd());
		System.out.println("main!");
		service.write(dto);
		System.out.println("성공!");
		return "success";
	}

/*	@RequestMapping("/register")
	public String register(){
		
		System.out.println("main!");
	//	service.write(dto);
	//	System.out.println("성공!");
		return "success";
	}*/
	
/*	@RequestMapping("/login")
	public String login(){
		
		System.out.println("login!");
	//	service.write(dto);
	//	System.out.println("성공!");
		return "success";
	}
	*/
/*	@RequestMapping("/writez")
	public String write(){
	
		System.out.println("zzz");
		//service.write(dto);
		return "success";
	}
*/


}
