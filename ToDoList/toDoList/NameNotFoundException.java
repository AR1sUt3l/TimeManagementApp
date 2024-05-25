package toDoList;

import javax.swing.JOptionPane;

/**
 * Lead Author(s):
 * @author Aleczandria Villagracia
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 05.24.2024.01
 * 
 * Responsibilities of class:
 * 
 */

public class NameNotFoundException extends Exception
{
	private static final String MESSAGE = "Invalid Entry\nPlease enter a name";
	
	public NameNotFoundException()
	{
		super(MESSAGE);
	}
}
