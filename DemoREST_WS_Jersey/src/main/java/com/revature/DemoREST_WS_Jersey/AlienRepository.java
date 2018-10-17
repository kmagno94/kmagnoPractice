package com.revature.DemoREST_WS_Jersey;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	List<Alien> aliens;
	
	public AlienRepository() {
		aliens = new ArrayList<Alien>();
		
		Alien k = new Alien("Kevin", 101, 77);
		Alien j = new Alien("Jill", 102, 100);
		
		aliens.add(k);
		aliens.add(j);
	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public void setAliens(List<Alien> aliens) {
		this.aliens = aliens;
	}
	
	public Alien getAlien(int id) {

		for(Alien al : aliens) {
			if(al.getId()==id) {
				return al;
			}
		}
		
		return new Alien();
	}

	public void create(Alien a) {
		aliens.add(a);
	}
	
}
