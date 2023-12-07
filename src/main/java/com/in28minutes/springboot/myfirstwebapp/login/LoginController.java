package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoLoginPage(ModelMap model) {
		model.put("name", "Noah Saleh");
		return "welcome";
	}
}


//Old Code
//private AuthenticationService authenticationService;
//
//public LoginController(AuthenticationService authenticationService) {
//	super();
//	this.authenticationService = authenticationService;
//}

//Old Code
//@RequestMapping(value="login",method = RequestMethod.POST)
//public String gotoWelcomePage(@RequestParam String name,
//		@RequestParam String password, ModelMap model) {
//	if(authenticationService.authenticate(name, password)) {
//	model.put("name", name);
//	
//	return "welcome";
//	}
//	
//	model.put("errorMessage", "Invalid Credentials! Please try again.");
//	return "loginPage";
//}


//AuthenticationService.java file [Now Deprecated]
//package com.in28minutes.springboot.myfirstwebapp.login;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthenticationService {
//
//	public boolean authenticate(String username, String password) {
//		boolean isValidUserName = username.equalsIgnoreCase("in28minutes");
//		boolean isValidPassword = password.equalsIgnoreCase("dummy");
//		return isValidUserName && isValidPassword;
//		
//	}
//	
//}