package toDoList;

import java.sql.Time;

public class CalendarDate
{
	private Time _time = new Time(0);
	private String _day;
	private int _date;
	private Month _month;
	private int _year;
	
	public CalendarDate(int date, int month, int year)
	{
		_date = date;
		_month = determineMonth(month);
		_year = year;
	}

	private Month determineMonth(int month)
	{
		
		return null;
	}
	
}
