/**
 * 
 */
package edu.cvtc.web.model;

/**
 * @author gcedarblade
 * 
 * This class represents a Person object in our system.
 *
 */
public class Person {
	
	//Class variables
	private String firstName;
	private String lastName;
	private Integer age;
	private String favoriteColor;
	
	
	// Constructor 
	public Person(final String firstName, final String lastName, final int age, final String favoriteColor) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.favoriteColor = favoriteColor;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Integer getAge() {
		return age;
	}


	public String getFavoriteColor() {
		return favoriteColor;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", favoriteColor="
				+ favoriteColor + "]";
	}
	
}
