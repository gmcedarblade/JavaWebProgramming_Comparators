package edu.cvtc.web.dao;

import java.util.List;

import edu.cvtc.web.exceptions.PersonDatabaseException;
import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public interface PersonDao {
	
	void populatePersonTable(String filePath) throws Exception;

	List<Person> retrievePeople() throws PersonDatabaseException;
}
