package com.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Myuser, Long> {

	
	Myuser findByUsername(String username);
	
}
