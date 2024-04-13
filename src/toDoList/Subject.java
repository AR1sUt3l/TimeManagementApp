package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Subject
{
	private static ArrayList<String> _listOfSubjects = new ArrayList<>();
	private String _subject;
	
	private static void defaultList()
	{
		_listOfSubjects.add("General");
		_listOfSubjects.add("English");
		_listOfSubjects.add("Mathematics");
		_listOfSubjects.add("Science");
		_listOfSubjects.add("Language");
		_listOfSubjects.add("Humanities");
		_listOfSubjects.add("Economics");
		_listOfSubjects.add("History");
		_listOfSubjects.add("Communication");
		_listOfSubjects.add("Other");
		Collections.sort(_listOfSubjects);
	}
	
	public Subject()
	{
		_subject = _listOfSubjects.get(0);
	}
	
	public Subject(String subject)
	{
		_subject = subject;
		addNewSubject(subject);
	}
	
	public String getSubject()
	{
		return _subject;
	}
	
	public void setSubject(String subject)
	{
		_subject = subject;
	}
	
	public void addNewSubject(String subject)
	{
		subject.toLowerCase();
		subject.substring(0, 0).toUpperCase();
		for (int i = 0; i < _listOfSubjects.size(); i++)
		{
			if(subject != _listOfSubjects.get(i))
			{
				_listOfSubjects.add(subject);
			}
		}
		Collections.sort(_listOfSubjects);
	}
}
