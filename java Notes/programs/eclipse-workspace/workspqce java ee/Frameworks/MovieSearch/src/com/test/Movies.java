package com.test;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="movies")
public class Movies {

	@Id
	@Column(name="Srno")
	private int srno;
	
	@Column(name="Mname")
	private String mname;
	
	@Column(name="Actors")
	private String actors;
	
	@Column(name="RelaseDate")
    private double date;
	
	@Column(name="Description")
    private String discription;
    
    
    Movies(){}


	public Movies(int srno, String mname, String actors, double date, String discription) {
		super();
		this.srno = srno;
		this.mname = mname;
		this.actors = actors;
		this.date = date;
		this.discription = discription;
	}


	public int getSrno() {
		return srno;
	}


	public void setSrno(int srno) {
		this.srno = srno;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getActors() {
		return actors;
	}


	public void setActors(String actors) {
		this.actors = actors;
	}


	public double getDate() {
		return date;
	}


	public void setDate(double date) {
		this.date = date;
	}


	public String getDiscription() {
		return discription;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}


	@Override
	public String toString() {
		return  "Movies [srno=" + srno + ", mname=" + mname + ", actors=" + actors + ", date=" + date + ", discription="
				+ discription + "]";
	}
    
}

