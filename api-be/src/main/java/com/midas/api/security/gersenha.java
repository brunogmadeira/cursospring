package com.midas.api.security;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class gersenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String senha = new BCryptPasswordEncoder().encode("bruno");
		System.out.println(senha);
		
	}

}
