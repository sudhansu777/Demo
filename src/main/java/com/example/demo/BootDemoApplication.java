package com.example.demo;

import com.example.demo.entity.Skill;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		//Added a user
		User user= new User("Sushanshu", null);
		user.setSkills(Arrays.asList(new Skill("Jenkins"), new Skill("K8S")));
		user= userRepository.save(user);

	}
}
