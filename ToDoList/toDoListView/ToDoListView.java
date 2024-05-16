package toDoListView;

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
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 550;
	private static final String TITLE = "To Do List";
	private static final String TEXT_FOR_TODAY = "Today";
//	private static final String SEPARATION_LINE
	
	private JPanel mainPanel = new JPanel();
	private JPanel todayPanel = new JPanel();
	private JPanel datePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	
	private JLabel topText;
	private JLabel lineBreak;
	private JLabel date;
	private JButton taskButton;
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
		addTaskSection();
		addDateSection();
		addTaskButton();
		addBottomSection();
		add(mainPanel);
	}
	
	private void addTodayText()
	{
		topText = new JLabel(TEXT_FOR_TODAY);
		todayPanel.add(topText);
		mainPanel.add(todayPanel);
	}
	
	private void addTaskSection()
	{
		mainPanel.add(new TaskPanel());
	}
	
	private void addDateSection()
	{
		date = new JLabel("Date");
		datePanel.add(new Line());
		datePanel.add(date);
		mainPanel.add(datePanel);
	}
	
	private void addTaskButton()
	{
		taskButton = new JButton("Add Task");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(taskButton);
		mainPanel.add(buttonPanel);
	}
	
	private void addBottomSection()
	{
		toDoListButton = new JButton("To Do List");
		toDoListButton.setBounds(0, 10, 100, 10);
		homeButton = new JButton("Home");
		homeButton.setBounds(110, 10, 100, 10);
		timerButton = new JButton("Pomodoro Timer");
		timerButton.setBounds(220, 10, 100, 10);
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
