package toDoList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestToDoList
{

	@Test
	void testType()
	{
		Type subject1 = new Type("english");
		assertEquals("English", subject1.getType());
		assertEquals("General, English", subject1.toString());
		Type subject2 = new Type();
		assertEquals("General", subject2.getType());
		assertEquals("General, English", subject2.toString());
		assertEquals("General, English", subject1.toString());
		subject2.setType("Math 150");
		assertEquals("Math 150", subject2.getType());
		assertEquals("General, English, Math 150", subject2.toString());
		assertEquals("General, English, Math 150", subject1.toString());
		Type subject3 = new Type("black studies");
		assertEquals("Black Studies", subject3.getType());
		assertEquals("General, English, Math 150, Black Studies", subject3.toString());
		subject3.sortAlphabetically();
		assertEquals("General, Black Studies, English, Math 150", subject3.toString());
	}
	
	@Test
	void testMonth()
	{
		Month jan = new Month(1);
		assertEquals(1, jan.getMonthNumber());
		assertTrue(jan.isAValidMonthNumber());
	}
	
	@Test
	void testTask()
	{
		Task task1 = new Task("EL Homework");
		assertEquals("EL Homework", task1.getName());
		task1.setName("English Essay");
		assertNotEquals("EL Homework", task1.getName());
		assertEquals("English Essay", task1.getName());
	}

}
