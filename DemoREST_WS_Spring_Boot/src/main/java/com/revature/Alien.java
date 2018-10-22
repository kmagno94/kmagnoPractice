package com.revature;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="ALIENS")
public class Alien implements Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alien(int id, String name, int points) {
		super();
		this.id = id;
		this.name = name;
		this.points = points;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="alienSequence")
	@SequenceGenerator(allocationSize=1,name="alienSequence",sequenceName="SQ_ALIEN_PK")
	@Column(name="ALIEN_ID")
	private int id;

	@Column(name="ALIEN_NAME")
	private String name;
	
	@Column(name="ALIEN_POINTS")
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
		return "Alien [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
}
