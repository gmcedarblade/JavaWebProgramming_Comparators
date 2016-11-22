package edu.cvtc.web.dao.impl;

import java.io.File;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import edu.cvtc.web.dao.PersonDao;
import edu.cvtc.web.exceptions.PersonDatabaseException;
import edu.cvtc.web.model.Person;
import edu.cvtc.web.util.DBUtility;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * @author gcedarblade
 *
 */
public class PersonDaoImpl implements PersonDao {

	private static final String DROP_TABLE_PERSON = "drop table if exists person;";
	private static final String CREATE_TABLE_PERSON = "create table person (id integer primary key autoincrement,"
			+ "firstName text, lastName text, age integer, favoriteColor text);";
	private static final String SELECT_ALL_FROM_PERSON = "select * from person;";
	
	@Override
	public void populatePersonTable(final String filePath) throws Exception {
		
		final Connection connection = DBUtility.createConnection();
		final Statement statement = connection.createStatement();
		
		try {
		 	
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			statement.executeUpdate(DROP_TABLE_PERSON);
			
			statement.executeUpdate(CREATE_TABLE_PERSON);
			
			final File inputFile = new File(filePath);
			final List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);
			
			for (final Person person : people) {
				
				String insertValues = "insert into person (firstName, lastName, age, favoriteColor) values ("
						+ "'" + person.getFirstName() + "', '" + person.getLastName() + "', "
								+ "" + person.getAge() + ", '" + person.getFavoriteColor() + "');";
				
				System.out.println(insertValues); // Log a message to Console so we can see data being added.
				
				statement.executeUpdate(insertValues);
				
			}
			
		} finally {
			
			DBUtility.closeConnections(connection, statement);
			
		}

	}

	@Override
	public List<Person> retrievePeople() throws PersonDatabaseException {
		
		return null;
		
	}

}
