package com.cardatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cardatabase.domain.Myuser;
import com.cardatabase.domain.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Myuser currentUser = userRepository.findByUsername(userName);
		UserDetails user = new org.springframework.security.core.userdetails.User(userName, currentUser.getPassword(),
				true, true, true, true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
		return user;
	}

}
