package com.revature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@Autowired
	AlienRepository repo;

	@GetMapping("aliens")
	public List<Alien> getAliens() {
		List<Alien> aliens = repo.findAll();
		
//		aliens.add(new Alien("Kevin", 101, 88));
//		aliens.add(new Alien("Jill", 102, 77));
		
		return aliens;
	}
	
}
