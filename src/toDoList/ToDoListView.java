package toDoList;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDoListView extends JFrame
{
	private static final int WINDOW_WIDTH = 350;
	private static final int WINDOW_HEIGHT = 500;
	private static final String TITLE = "To Do List";
	private static final String TEXT_FOR_TODAY = "Today";
//	private static final String SEPARATION_LINE
	
	private JPanel mainPanel = new JPanel();
	private JPanel todayPanel = new JPanel();
	private TaskBox taskPanel = new TaskBox();
	private JPanel datePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	
	private JLabel topText;
	private JLabel lineBreak;
	private JCheckBox taskBox;
	private JLabel taskText;
	private JButton addTaskButton;
	private JButton toDoListButton;
	private JButton homeButton;
	private JButton timerButton;
	
	public ToDoListView()
	{
		initialFrame();
		initialUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	private void initialFrame()
	{
		setTitle(TITLE);
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	private void initialUI()
	{
		mainPanel.setLayout(new FlowLayout());
		addTodayText();
		addTaskSection();
		addTaskButton();
		addBottomSection();
		add(mainPanel);
	}
	
	private void addTodayText()
	{
		topText = new JLabel(TEXT_FOR_TODAY);
//		taskPanel.setAlignmentX(LEFT_ALIGNMENT);
//		taskText = new JLabel("Name of Task" + "\n" + "Deadline");
//		taskBox = new JCheckBox();
		todayPanel.add(topText);
//		taskPanel.add(taskText);
//		taskPanel.add(taskBox);
		mainPanel.add(todayPanel);
	}
	
	private void addTaskSection()
	{
//		taskText = new JLabel("Name of Task" + "\n" + "Deadline");
//		taskBox = new JCheckBox();
//		taskPanel.add(taskText);
//		taskPanel.add(taskBox);
		add(taskPanel);
	}
	
	private void addTaskButton()
	{
		addTaskButton = new JButton("Add Task");
		buttonPanel.add(addTaskButton);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		mainPanel.add(buttonPanel);
	}
	
	private void addBottomSection()
	{
		toDoListButton = new JButton("To Do List");
		homeButton = new JButton("Home");
		timerButton = new JButton("Pomodoro Timer");
		bottomPanel.add(toDoListButton);
		bottomPanel.add(homeButton);
		bottomPanel.add(timerButton);
		mainPanel.add(bottomPanel);
	}
	
	public static void main(String[] args)
	{
		new ToDoListView();
	}
	
}
