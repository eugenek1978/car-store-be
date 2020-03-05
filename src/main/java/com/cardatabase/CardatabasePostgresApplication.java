package com.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cardatabase.domain.Car;
import com.cardatabase.domain.CarRepository;
import com.cardatabase.domain.Myuser;
import com.cardatabase.domain.Owner;
import com.cardatabase.domain.OwnerRepository;
import com.cardatabase.domain.UserRepository;

@SpringBootApplication
public class CardatabasePostgresApplication {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository owneRrepository;

	@Autowired
	private UserRepository userrpository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabasePostgresApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
//			Owner owner1 = new Owner("John", "Johnson");
//			Owner owner2 = new Owner("Mary", "Robinson");
//			owneRrepository.save(owner1);
//			owneRrepository.save(owner2);
//
//			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
//			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));
//			carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
//
//			// username: user password: password
//			userrpository
//					.save(new Myuser("$2y$12$Z/fwzCqpZzYhoXIpx/alEuCM0CyHXi2qxvXlGR./YZ6afIrKL4d6O","USER","user"));
//			// username: admin password: password
//			userrpository
//					.save(new Myuser("$2y$12$Z/fwzCqpZzYhoXIpx/alEuCM0CyHXi2qxvXlGR./YZ6afIrKL4d6O", "ADMIN","admin"));

		};
	}

}
