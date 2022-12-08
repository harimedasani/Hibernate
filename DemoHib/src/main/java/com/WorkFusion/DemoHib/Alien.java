package com.WorkFusion.DemoHib;



import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //It is used to create the new table
//@Table(name ="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	
	
	@Id //used to set primary key
	private int aid;
	
	
	//@jakarta.persistence.Transient // Used to store Temporary data it is not available in table
	
	
	//private AlienName aname; 	//Hari Kumar Medasani
	 private String aname;
	
	// @Column(name="alien_color") //name is used to assign the column name using column annotation
	private String color;
	
	
	

	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
}
