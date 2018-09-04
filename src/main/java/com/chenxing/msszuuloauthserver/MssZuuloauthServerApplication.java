package com.chenxing.msszuuloauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@EnableAutoConfiguration
@RestController
public class MssZuuloauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssZuuloauthServerApplication.class, args);
	}
}
