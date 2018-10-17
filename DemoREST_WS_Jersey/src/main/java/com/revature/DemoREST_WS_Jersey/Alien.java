package com.revature.DemoREST_WS_Jersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	
	public Alien() {
		super();
	}
	
	
	public Alien(String name, int id, int points) {
		super();
		this.name = name;
		this.id = id;
		this.points = points;
	}



	private String name;
	private int id;
	private int points;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}


	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + ", points=" + points + "]";
	}
	
}
