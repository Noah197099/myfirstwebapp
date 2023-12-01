package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello(){
		return "Hello!";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String SayHelloHtml(){
		StringBuffer sb = new StringBuffer();
		
		return "Hello!";
	}
	
}
