package org.dxc.springsecurityOauth;

import java.security.Principal;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class SpringSecurityOauthApplication {
	
	
	
	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi siva welcome to Github"+principal.getName()+"welcome to spring secuirty";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauthApplication.class, args);
		System.out.println("hii");
	}

}
