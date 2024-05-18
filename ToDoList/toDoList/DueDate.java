package toDoList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DueDate
{
	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private LocalDateTime currentDate = LocalDateTime.now();
	private Date _dueDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	public DueDate(String date)
	{
		try
		{
			_dueDate = sdf.parse(date);
		}
		catch (ParseException e)
		{
			System.out.println("Incorrect Date Format");
		}
	}
	
	public String toString()
	{
		return sdf.format(_dueDate);
	}
}
