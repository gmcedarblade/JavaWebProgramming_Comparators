package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class LastNamePredicate implements Predicate<Person> {

	final String lastName;
	
	public LastNamePredicate(final String lastName) {
		
		this.lastName = lastName;
		
	}
	
	@Override
	public boolean apply(Person person) {
		return person.getLastName().equalsIgnoreCase(lastName);
	}

	
	
}
