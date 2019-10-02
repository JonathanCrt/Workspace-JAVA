package org.acme.fcsv;

import java.time.LocalDate;
import java.time.Period;
import java.io.*;
import java.util.*;

public class Client {
	final public int id;
	final public String name;
	final public LocalDate birthday;
	private String gender;
	private String title;
	private String surname;
	private String email;
	private String country;
	private String creditCard;
	private String height;

	public Client(int id, String name, LocalDate birthday, String gender, String title, String surname, String email,
			String country, String creditCard, String height) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.title = title;
		this.surname = surname;
		this.email = email;
		this.country = country;
		this.creditCard = creditCard;
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public String getHeight() {

		return height;
	}

	public void setHeight(String height) {

		this.height = height;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	}

	public String toCsv() {
		return id + ", " + name + ", " + birthday.toString();
	}

	public String getAvgMale() {

		return height;

	}

	public void setAvgMale(String height) {

		this.height = height;

	}
	
	public String getAvgFemale() {

		return height;

	}

	public void setAvgfemale(String height) {

		this.height = height;

	}
	
	
	public boolean isAdult() {
		return Period.between(birthday, LocalDate.now()).getYears()>=18;
	}
	
	
	

}
