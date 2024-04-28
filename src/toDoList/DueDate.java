package toDoList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DueDate
{
	private LocalDateTime _currentDate = LocalDateTime.now();
	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	
	public DueDate()
	{
		System.out.println(monthDayYear.format(_currentDate));
	}
}
