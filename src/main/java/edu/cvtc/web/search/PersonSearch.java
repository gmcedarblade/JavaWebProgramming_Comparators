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
	
}
