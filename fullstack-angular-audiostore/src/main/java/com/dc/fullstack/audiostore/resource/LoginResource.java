package com.dc.fullstack.audiostore.resource;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.fullstack.audiostore.service.UserService;

@RestController
public class LoginResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/token")
	public Map<String, String> token(HttpSession session, HttpServletRequest request){
		System.out.println(request.getRemoteHost());
		
		String remoteHost = request.getRemoteHost();
		int portNumber = request.getRemotePort();
	
		return Collections.singletonMap("token"	, session.getId());
	}
	
}
