package com.chenxing.msszuuloauthserver.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/client")
	public Principal home(Principal user) {
		return user;
	}
}
