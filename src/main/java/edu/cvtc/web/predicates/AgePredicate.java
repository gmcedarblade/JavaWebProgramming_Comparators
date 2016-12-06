package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class AgePredicate implements Predicate<Person> {

	final int age;
	
	public AgePredicate(final int age) {
		
		this.age = age;
		
	}
	
	@Override
	public boolean apply(Person person) {

		return person.getAge().equals(age);
	}

}
