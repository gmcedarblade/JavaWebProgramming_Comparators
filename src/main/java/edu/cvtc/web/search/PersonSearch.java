package edu.cvtc.web.search;

import java.util.List;

import edu.cvtc.web.exceptions.PersonSearchException;
import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public interface PersonSearch {

	List<Person> retrievePeople(String sortType) throws PersonSearchException;
	
	List<Person> findPeopleByLastName(String lastName) throws PersonSearchException;
	
	List<Person> findPeopleByFirstName(String firstName) throws PersonSearchException;
	
	List<Person> findPeopleByFavoriteColor(String favoriteColor) throws PersonSearchException;
	
	List<Person> findPeopleByAge(int age) throws PersonSearchException;
	
}
