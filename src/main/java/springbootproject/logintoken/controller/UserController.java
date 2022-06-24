package springbootproject.logintoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbootproject.logintoken.model.User;
import springbootproject.logintoken.service.UserService;

@RestController

public class UserController {

    @Autowired
	UserService userservice;
	
	@PostMapping("/signup")
    
    public User signup(@RequestBody User user) {
    	
    	return userservice.signup(user);
    }
	
	@GetMapping("/signin")
	
	public User signin(@RequestParam String username , @RequestParam String password) {
		
		return userservice.signin(username , password);
				
	}
} 
