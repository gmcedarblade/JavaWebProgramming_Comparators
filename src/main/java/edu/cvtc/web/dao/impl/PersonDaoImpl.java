package edu.cvtc.web.dao.impl;

import java.util.List;

import edu.cvtc.web.dao.PersonDao;
import edu.cvtc.web.exceptions.PersonDatabaseException;
import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class PersonDaoImpl implements PersonDao {

	/* (non-Javadoc)
	 * @see edu.cvtc.web.dao.PersonDao#populatePersonTable(java.lang.String)
	 */
	@Override
	public void populatePersonTable(String filePath) throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.cvtc.web.dao.PersonDao#retrievePeople()
	 */
	@Override
	public List<Person> retrievePeople() throws PersonDatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
