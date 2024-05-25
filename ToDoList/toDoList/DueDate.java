package toDoList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

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

public class DueDate
{
	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private LocalDateTime currentDate = LocalDateTime.now();
	private String dueDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private String noDueDate = "";
	
	public DueDate(String date)
	{
//		if (date == "" || date == null)
//		{
//			noDueDate = "No Deadline";
//		}
//		else
//		{
//			try
//			{
//				dueDate = sdf.parse(date);
//			}
//			catch (IllegalArgumentException e)
//			{
//				System.out.println("Invalid Date");
//			}
//			catch (ParseException e)
//			{
//				System.out.println("Incorrect Date Format");
//			}
//		}
		this.dueDate = date;
	}
	
	/**
	 * 
	 * @return today's date as a string
	 */
	public String getCurrentDate()
	{
		return monthDayYear.format(currentDate);
	}
	
	/**
	 * @return the due date
	 */
	public String toString()
	{
		return dueDate;
	}
}
