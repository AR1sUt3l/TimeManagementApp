package toDoListView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
	
	private JPanel mainPanel;
	private JPanel todayPanel = new JPanel();
	private JPanel dueDatePanel = new JPanel();
	private JPanel noDueDatePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel imagePanel = new JPanel();
	
	private JLabel topText;
	private JLabel lineBreak;
	private JLabel dueDate;
	private JLabel noDueDate;
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
		add(new JLabel(new ImageIcon("images/ToDoListView/window.png")));
//		ImageIcon image = new ImageIcon("images/ToDoListView/window.png");
//		setIconImage(image);
	}
	
	private void initialUI()
	{
		mainPanel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				//Load background image and draw it
				//image from acesporty.com
				ImageIcon backgroundImage = new ImageIcon("images/ToDoListView/mainView.png");
				g.drawImage(backgroundImage.getImage(),0, 0,getWidth(), getHeight(),this);
				}
			};
		mainPanel.setLayout(new FlowLayout());
//		addTodayText();
//		addDateSection();
		addDueDate();
		addNoDueDate();
		
		addTaskButton();
		addBottomSection();
		add(mainPanel);
	}
	
//	private void addTodayText()
//	{
//		topText = new JLabel(TEXT_FOR_TODAY);
//		todayPanel.add(topText);
//		mainPanel.add(todayPanel);
//	}
	
	private void addTaskSection()
	{
		mainPanel.add(new TaskPanel());
	}
	
//	private void addDateSection()
//	{
//        date = new JLabel("Date");
//		datePanel.add(new Line());
//		datePanel.add(date);
//		mainPanel.add(datePanel);
//	} 
	
	private void addDueDate()
	{
		dueDate = new JLabel("To Do");
		dueDatePanel.add(dueDate);
		mainPanel.add(dueDatePanel);
	}
	
	private void addNoDueDate()
	{
		noDueDate = new JLabel("No Deadline");
		noDueDatePanel.add(noDueDate);
		mainPanel.add(noDueDatePanel);
	}
	
	private void addTaskButton()
	{
		settingsButton = new JButton("Settings");
		taskButton = new JButton("Add Task");
		TaskButtonListener listener = new TaskButtonListener();
		taskButton.addActionListener(listener);
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
	
	private class TaskButtonListener implements ActionListener
	{		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			new AddTaskView();
		}
	}
	
}
