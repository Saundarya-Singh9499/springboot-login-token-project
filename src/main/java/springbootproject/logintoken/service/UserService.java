package springbootproject.logintoken.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootproject.logintoken.model.User;
import springbootproject.logintoken.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	
	
	public User signup(User user) {
		
	    return userrepository.save(user);
	}
	
	public User signin(String username , String password) {
		
		 return userrepository.findByUsernameAndPassword(username, password);
	}

}
