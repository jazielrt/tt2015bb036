package com.tt2015b036.domine.entities;

public class Usuario {

	private int id;
	private String username;
	private String email;
	
	public Usuario(){
		
	}
	
	public Usuario( int id, String usr, String mail){
		this.id = id;
		this.username = usr;
		this.email = mail;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
