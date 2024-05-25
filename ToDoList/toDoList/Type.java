package toDoList;

public class Type
{
	private String _type;
	protected static final String DEFAULT_TYPE = "General";
	
	public Type()
	{
		_type = DEFAULT_TYPE;
	}
	
	public Type(String type)
	{
		type = formatWord(type);
		_type = type;
	}
	
	public String getType()
	{
		return _type;
	}
	
	public void setType(String type)
	{
		_type = type;
	}
	
	public String formatWord(String word)
	{
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++)
		{
			if(i == 0 || word.charAt(i - 1) == ' ')
			{
				word = word.replaceFirst(word.substring(i, i + 1), word.substring(i, i + 1).toUpperCase());
			}
		}
		return word;
	}
	
	public String toString()
	{
		return _type;
	}
	
}
