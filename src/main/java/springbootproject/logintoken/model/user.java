package springbootproject.logintoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class user {
	
	
	@Id
	private int id;
	
	private String username;
	
	
	public user() {
		
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

}