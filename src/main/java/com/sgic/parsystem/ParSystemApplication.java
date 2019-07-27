package com.sgic.parsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgic.parsystem.entities.Role;
import com.sgic.parsystem.entities.SchedulePar;
import com.sgic.parsystem.entities.User;
import com.sgic.parsystem.repository.RoleRepository;
import com.sgic.parsystem.repository.ScheduleParRepository;
import com.sgic.parsystem.repository.UserRepository;

@SpringBootApplication
public class ParSystemApplication implements CommandLineRunner{
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ScheduleParRepository scheduleParRepository;

	public static void main(String[] args) {
		SpringApplication.run(ParSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Role role = new Role();
		role.setRoleName("abc");
		roleRepository.save(role);
		
		User user=new User();
		user.setEmail("abc@gmail.com");
		user.setPassword("1234");
		user.setRole(roleRepository.findRoleById(1));
		userRepository.save(user);
		
	
		SchedulePar schedulePar = new SchedulePar();
		schedulePar.setScheduledate(new Date());
		schedulePar.setVenue("Hall");
		schedulePar.setUser(userRepository.findUserById(1));
		List<String> newlist=new ArrayList<String>();
		newlist.add("person1");
		newlist.add("person2");
		newlist.add("person3");
		schedulePar.setAppraisers(newlist);
		scheduleParRepository.save(schedulePar);
		
	}

}
