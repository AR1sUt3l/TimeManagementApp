package toDoListView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import toDoList.Task;

public class WithoutDeadlinePanel extends JPanel
{
	private JLabel noDueDate;
	private JScrollPane scrollPane;
	
	private Task task;
	private ToDoListView mainView;
	
	private int count = 0; 
	
	public WithoutDeadlinePanel(ToDoListView mainView)
	{
		this.mainView = mainView;
		noDueDate = new JLabel("No Deadline");
		add(noDueDate);
		setBorder(BorderFactory.createLineBorder(Color.CYAN));
		setLayout(new FlowLayout());
		setOpaque(false);
//		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		add(scrollPane);
//		add(new JScrollPane());
		scrollPane = new JScrollPane(this);
//		add(scrollPane);
	}
	
	public void addTaskPanel(Task newTask)
	{
		add(new WithDeadlineTaskPanel(newTask, mainView));
		revalidate();
	}
	
}