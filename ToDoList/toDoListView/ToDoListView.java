package toDoListView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ToDoListView extends JFrame
{
	public static final int WINDOW_WIDTH = 600;
	public static final int WINDOW_HEIGHT = 850;
	private static final String TITLE = "To Do List";
	private static final String TEXT_FOR_TODAY = "Today";
//	private static final String SEPARATION_LINE
//	private static final JSeparator
	
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
	private JButton settingsButton;
	
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
		datePanel.add(new JLabel("Hello"));
		JSeparator s = new JSeparator(); 
        s.setOrientation(SwingConstants.HORIZONTAL); 	
        datePanel.add(s);
        date = new JLabel("Date");
		datePanel.add(new Line());
		datePanel.add(date);
		mainPanel.add(datePanel);
	} 
	private void addTaskButton()
	{
		settingsButton = new JButton("Settings");
		taskButton = new JButton("Add Task");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(taskButton);
		buttonPanel.add(settingsButton);
		mainPanel.add(buttonPanel);
	}
	
	private void addBottomSection()
	{
		bottomPanel.setLayout(new GridLayout());
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
