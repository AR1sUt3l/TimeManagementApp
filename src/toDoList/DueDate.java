package toDoList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DueDate
{
	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private LocalDateTime _currentDate = LocalDateTime.now();
	
	public DueDate()
	{
		// System.out.println(monthDayYear.format(_currentDate));
	}
	
	public String toString()
	{
		return monthDayYear.format(_currentDate);
	}
}
