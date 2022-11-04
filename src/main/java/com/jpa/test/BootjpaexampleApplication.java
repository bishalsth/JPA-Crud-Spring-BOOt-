package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;


@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
		
//		user.setName("Puran  shrtesth");
//		user.setCity("ktm");
//		user.setStatus("I am a Java Developer");
//		
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		Saving Single USer
		
//		User user1 = new User();
//		user1.setName("amrit SHrestha");
//		user1.setCity("gorkha");
//		user1.setStatus("react devloper");
//		
//		User user2 = new User();
//		user2.setName("shyam ck");
//		user2.setCity("DOlakha");
//		user2.setStatus("Owner");
		
//		saving single user
//		User resultUser = userRepository.save(user1);
//		System.out.println("saved user"+ resultUser);
//		
//		saving multiple user
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(a->{
//		System.out.println(a);
//		});
//		
//	
//		System.out.println("done");
		
//		Update the user
		
//		
//		Optional<User> optional = userRepository.findById(6);
//		
//		User user = optional.get();
//		user.setName("Maya adhikari");
//		userRepository.save(user);
//		System.out.println(user);
		
		
//		how to get Data
//		Iterable<User> itr = userRepository.findAll();
//		
//		itr.forEach(user->{
//			System.out.println(user);
//		});
//		
		
//		Deleting the user element
		
		userRepository.deleteById(6);
		System.out.println("deleted");
	}

}
