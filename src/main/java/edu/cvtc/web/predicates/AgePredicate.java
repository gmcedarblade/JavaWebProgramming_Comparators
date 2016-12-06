package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class AgePredicate implements Predicate<Person> {

	final Integer age;
	
	public AgePredicate(final Integer age) {
		
		this.age = age;
		
	}
	
	@Override
	public boolean apply(Person person) {

		return person.getAge().equals(age);
	}

}
