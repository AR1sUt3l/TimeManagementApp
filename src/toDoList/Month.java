package toDoList;

public class Month
{
	public enum MonthName
	{
		INVALID_MONTH,
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER
	}
	
	private MonthName _monthName = MonthName.INVALID_MONTH;
	private int _monthNumber;
	
	public Month(int monthNumber)
	{
//		while(!isAValidMonthNumber(monthNumber))
//		{
//			
//		}
		_monthNumber = monthNumber;
	}
	
	public int getMonthNumber()
	{
		return _monthNumber;
	}
	
	public void setMonthNumber(int monthNumber)
	{
		_monthNumber = monthNumber;
	}
	
	public boolean isAValidMonthNumber()
	{
		if(_monthNumber > 0 && _monthNumber < 13)
		{
			return true;
		}
		return false;
	}
	
	public void setMonthName()
	{
		switch (_monthNumber)
		{
			case 1:
				_monthName = MonthName.JANUARY;
				break;
			case 2:
				_monthName = MonthName.FEBRUARY;
				break;
			case 3:
				_monthName = MonthName.MARCH;
				break;
			case 4:
				_monthName = MonthName.APRIL;
				break;
			case 5:
				_monthName = MonthName.MAY;
				break;
			case 6:
				_monthName = MonthName.JUNE;
				break;
			case 7:
				_monthName = MonthName.JULY;
				break;
			case 8:
				_monthName = MonthName.AUGUST;
				break;
			case 9:
				_monthName = MonthName.SEPTEMBER;
				break;
			case 10:
				_monthName = MonthName.OCTOBER;
				break;
			case 11:
				_monthName = MonthName.NOVEMBER;
				break;
			case 12:
				_monthName = MonthName.DECEMBER;
				break;
			default:
				_monthName = MonthName.INVALID_MONTH;
				break;
				
		}
	}
	
	public MonthName getMonthName()
	{
		return _monthName;
	}
	
}
