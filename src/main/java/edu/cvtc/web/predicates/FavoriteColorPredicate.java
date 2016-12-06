package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class FavoriteColorPredicate implements Predicate<Person>{

	final String favoriteColor;
	
	public FavoriteColorPredicate(final String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	
	@Override
	public boolean apply(Person person) {

		return person.getFavoriteColor().equalsIgnoreCase(favoriteColor);
	}
	
	

}
