package edu.cvtc.web.comparators;

import java.util.Comparator;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class FavoriteColorComparator implements Comparator<Person> {

	@Override
	public int compare(Person firstPerson, Person secondPerson) {
	
		return firstPerson.getFavoriteColor().compareTo(secondPerson.getFavoriteColor());
	}

}
