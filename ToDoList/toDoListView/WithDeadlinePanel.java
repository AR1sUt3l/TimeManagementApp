package toDoListView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import toDoList.DueDate;
import toDoList.ListOfTasks;
import toDoList.Task;

public class WithDeadlinePanel extends JPanel
{
	private JLabel dueDate;
	private JScrollPane scrollPane;
	
	private Task task;
	private ToDoListView mainView;
	
	private int count = 0;
	
	public WithDeadlinePanel(ToDoListView mainView)
	{
		this.mainView = mainView;
		dueDate = new JLabel("With Deadline");
		add(dueDate);
		setBorder(BorderFactory.createLineBorder(Color.PINK));
		setBackground(Color.WHITE);
		setOpaque(false);
//		setVisibleRowCount(3);
//		JScrollPane scrollPane = new JScrollPane(nameList);
	}
	
	public void addTaskPanel(Task newTask)
	{
		add(new WithDeadlineTaskPanel(newTask, mainView));
		count++;
		if (count == 6)
		{
			scrollPane = new JScrollPane(this);
			add(scrollPane);
		}
		revalidate();
	}

}
