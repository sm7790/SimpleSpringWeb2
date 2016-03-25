package com.simple.rest.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simple.rest.bean.User;


@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@RequestMapping(value = "/{user_name}", method = RequestMethod.GET)
    public com.simple.rest.bean.User getUser(@PathVariable("user_name") String userName) {
		 User foundUser =null;
		 if (StringUtils.isNotEmpty(userName)){
			  foundUser = createDummyUser(userName);
		 }
       
		return foundUser;
		
	}

	
	private User createDummyUser(String userName) {

		User user = new User();

		user.setUserName(userName);
		user.setUserEmail("abc@email.com");
		user.setUserDescription("test user");
		user.setUserDepartment("sales");

		return user;

	}
}
