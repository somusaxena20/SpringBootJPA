package com.project;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.dao.UserRepo;
import com.project.entites.User;

@SpringBootApplication
public class SpringBootJpa2Application {

	public static void main(String[] args) {
		ApplicationContext obj = SpringApplication.run(SpringBootJpa2Application.class, args);
		UserRepo bean = obj.getBean(UserRepo.class);

//		Iterable<User> findAll = bean.findAll();
//		System.out.println();
//		findAll.forEach(e ->{
//			System.out.println(e);
//		});
//		System.out.println();

//		List<User> city = bean.findByCity("NAVI MUMBAI");
//		
//		city.forEach(e ->{
//			System.out.println(e);
//		});

//		List<User> name = bean.findAllOrderName();
//		
//		name.forEach(e ->{
//			System.out.println(e);
//		});

//		List<User> name = bean.findAllReverseId();
//
//		name.forEach(e -> {
//			System.out.println(e);
//		});
		
		List<User> name = bean.findByName("SHIVAM SALAME");
		
		System.out.println(name);

	}

}
