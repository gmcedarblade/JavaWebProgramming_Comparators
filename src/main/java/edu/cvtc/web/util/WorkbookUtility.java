/**
 * 
 */
package edu.cvtc.web.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.model.Person;

/**
 * @author gcedarblade
 *
 */
public class WorkbookUtility {

	// This method returns a List of Person objects from a File.
	public static List<Person> retrievePeopleFromWorkbook(final File inputFile) throws InvalidFormatException, IOException {
		final List<Person> people = new ArrayList<>();
		
		// Getting the Workbook from our Excel spreadsheet
		final Workbook workbook = WorkbookFactory.create(inputFile);
		
		// Getting the first Worksheet in our Workbook
		final Sheet sheet = workbook.getSheetAt(0);
		
		// Iterate over each row in the Worksheet
		for (final Row row : sheet) {
			
			// retrieve the values from each cell and use them to create a new Person object
			final Cell firstNameCell = row.getCell(0);
			final Cell lastNameCell = row.getCell(1);
			final Cell ageCell = row.getCell(2);
			final Cell favoriteColorCell = row.getCell(3);
			
			
			// Creating local variables for our arguments
//			final String firstName = firstNameCell.getStringCellValue().trim();
//			final String lastName = lastNameCell.getStringCellValue().trim();
//			
//			// cast to an int since getNumericCellValue returns a double
//			final int age = (int) ageCell.getNumericCellValue();
//			final String favoriteColor = favoriteColorCell.getStringCellValue().trim();
//			
//			final Person person = new Person(firstName, lastName, age, favoriteColor);
			
			// Grab the value and not create a local variable, and pass the value directly into the parameters
			final Person person = new Person(
										firstNameCell.getStringCellValue().trim(),
										lastNameCell.getStringCellValue().trim(),
										(int) ageCell.getNumericCellValue(),
										favoriteColorCell.getStringCellValue().trim());
			
			// Adding each new person to the list of the Person objects
			people.add(person);
			
		}
		
		// Returns the populated list (but only if there were rows in the worksheet)
		return people;
	}
	
}
