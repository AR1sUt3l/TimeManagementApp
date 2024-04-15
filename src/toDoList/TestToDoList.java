package toDoList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestToDoList
{

	@Test
	void testType()
	{
		Type subject1 = new Type();
		assertEquals("General", subject1.getType());
		Type subject2 = new Type("English");
		assertEquals("English", subject2.getType());
		subject2.setType("Math 150");
		assertEquals("Math 150", subject2.getType());
	}

}
