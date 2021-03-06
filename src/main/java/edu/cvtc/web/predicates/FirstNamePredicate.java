package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class FirstNamePredicate implements Predicate<Person>{

	private String firstName;
	
	public FirstNamePredicate(final String firstName) {
		
		this.firstName = firstName;
		
	}
	
	@Override
	public boolean apply(final Person person) {
		
		if (person.getFirstName().equalsIgnoreCase(firstName)) {
			return true;
		}
		return false;
		
		/*
		 * Or could do just do this
		 * 
		 * return person.getFirstName().equals(firstName);
		 * */
		
	}

}
