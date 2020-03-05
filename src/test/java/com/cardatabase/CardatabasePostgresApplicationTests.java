package com.cardatabase;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.StreamSupport;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cardatabase.web.CarController;

@SpringBootTest
class CardatabasePostgresApplicationTests {

	@Autowired
	private CarController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
		
		System.out.println(StreamSupport.stream(controller.getCars().spliterator(),false).count());
	}

}
