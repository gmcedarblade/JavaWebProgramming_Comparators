package edu.cvtc.web.search.impl;

import java.util.Collections;
import java.util.List;

import edu.cvtc.web.comparators.AgeComparator;
import edu.cvtc.web.comparators.FavoriteColorComparator;
import edu.cvtc.web.comparators.FirstNameComparator;
import edu.cvtc.web.comparators.LastNameComparator;
import edu.cvtc.web.comparators.SortBy;
import edu.cvtc.web.dao.PersonDao;
import edu.cvtc.web.dao.impl.PersonDaoImpl;
import edu.cvtc.web.exceptions.PersonSearchException;
import edu.cvtc.web.model.Person;
import edu.cvtc.web.search.PersonSearch;

/**
 * @author gcedarblade
 *
 */
public class PersonSearchImpl implements PersonSearch {

	private PersonDao personDao = new PersonDaoImpl();
	
	@Override
	public List<Person> retrievePeople(String sortType) throws PersonSearchException {

		try {
			
			final List<Person> people = personDao.retrievePeople();
			
			if (null != sortType){
				sortPeople(people, sortType);
			}
			
			return people;
			
		} catch (final Exception e) {
			
			e.printStackTrace();
			throw new PersonSearchException("The list of people could not be retrieved from the database.");
		}
		
	}
	
	private void sortPeople(final List<Person> people, final String sortType) {
		
		switch(sortType) {
		
			case SortBy.AGE:
				Collections.sort(people, new AgeComparator());
				break;
			case SortBy.LAST_NAME:
				Collections.sort(people, new LastNameComparator());
				break;
			case SortBy.FIRST_NAME:
				Collections.sort(people, new FirstNameComparator());
				break;
			case SortBy.FAVORITE_COLOR:
				Collections.sort(people, new FavoriteColorComparator());
				break;
			default:
				break;
		}
		
	}

	
	@Override
	public List<Person> findPeopleByLastName(String lastName) throws PersonSearchException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Person> findPeopleByFirstName(String firstName) throws PersonSearchException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Person> findPeopleByFavoriteColor(String favoriteColor) throws PersonSearchException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Person> findPeopleByAge(int age) throws PersonSearchException {
		// TODO Auto-generated method stub
		return null;
	}

}
