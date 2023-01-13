package com.Movie.MovieTicketBooking.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Oder")
public class Oder  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Oderid")
    private Integer oderId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "theaterName")
    private String theaterName;
    

    @Column(name = "movieName")
    private String movieName;
    
    @Column(name = "language")
    private String language;
    
  
	public Oder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Oder(int oderId, String username, String theatername, String moviename, String language) {
		super();
		this.oderId = oderId;
		this.userName = userName;
		this.theaterName = theaterName;
		this.movieName = movieName;
		this.language = language;
	}
	public Integer getOderId() {
		return oderId;
	}
	public void setOderId(Integer oderId) {
		this.oderId = oderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Oder [oderId=" + oderId + ", userName=" + userName + ", theaterName=" + theaterName + ", movieName="
				+ movieName + ", language=" + language + "]";
	}
}
	
	