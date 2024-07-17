package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Blog {

	


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int roolno;
		private String name;
		private String username;
		private String password;
		
		public int getRoolno() {
			return roolno;
		}
		public void setRoolno(int roolno) {
			this.roolno = roolno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}
	
	

