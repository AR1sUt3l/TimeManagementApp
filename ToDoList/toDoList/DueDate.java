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
//	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	private DateTimeFormatter monthDayYear = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private LocalDateTime currentDate = LocalDateTime.now();
	private LocalDateTime dueDate;
	private int deadlineDate;
	private int deadlineMonth;
	private int deadlineYear;
	private Date _dueDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
//	public DueDate(int day, int month, int year)
	public DueDate(String date)
	{
		// System.out.println(monthDayYear.format(_currentDate));
//		_deadlineDate = date;
//		_deadlineMonth = month;
//		_deadlineYear = year;
//		_dueDate.plusDays(_currentDate.getDayOfMonth() - date);
//		_dueDate.plusMonths(_currentDate.getMonthValue() - month);
//		_dueDate.plusYears(_currentDate.getYear() - year);
//		try
//		{
//			LocalDate _date = LocalDate.parse(date, monthDayYear);
//		}
//		catch (DateTimeParseException e)
//		{
//			e.printStackTrace();
//		}
//		Date _date = new Date();
//		_date.
//		dueDate = currentDate.plusDays(currentDate.getDayOfMonth() - day);
//		dueDate = currentDate.plusMonths(currentDate.getMonthValue() - month);
//		dueDate = currentDate.plusYears(currentDate.getYear() - year);
		try
		{
			_dueDate = sdf.parse(date);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}
	
	public String toString()
	{
		return sdf.format(_dueDate);
	}
	
	public static void main(String[] args)
	{
		DueDate date = new DueDate("07/19/2024");
		
		System.out.println(date.toString());
	}
}
