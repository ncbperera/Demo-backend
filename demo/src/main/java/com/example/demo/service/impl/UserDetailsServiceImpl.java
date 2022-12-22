package com.example.demo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> roles = null;
		//have to replace the code with DB 
		if (username.equals("admin")) {
			roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
			return new User("admin", "$2a$10$vLh9KbOhe3K.DXIuaF1d0ezGvFUTvBXA26nvIM6D8CNA0p4JrknYC", roles);
		}
		if (username.equals("user")) {
			roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
			return new User("user", "$2a$10$vLh9KbOhe3K.DXIuaF1d0ezGvFUTvBXA26nvIM6D8CNA0p4JrknYC", roles);
		}
		throw new UsernameNotFoundException("User not found with the name "+ username);
	}

}
