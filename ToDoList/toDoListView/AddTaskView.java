package toDoListView;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddTaskView extends JFrame
{
	private static final int WINDOW_HEIGHT = 600;
	private static final int WINDOW_WIDTH = 450;
	
	private JPanel mainPanel = new JPanel();
	private JPanel titlePanel = new JPanel();
	private JPanel namePanel = new JPanel();
	private JPanel typePanel = new JPanel();
	private JPanel deadlinePanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	
	private JLabel title;
	private JLabel nameLabel;
	private JTextField nameOfTask;
	private JLabel typeLabel;
	private JComboBox typeList;
	private JLabel deadlineLabel;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JButton enterButton;
	private JButton cancelButton;
	
	private String[] list = {"General", "English", "Math", "Science"};
	private String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
						   "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
						   "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	private String[] months = {"January", "February", "March", "April", "May", "June",
							   "July", "August", "September", "October", "November", "December"};
	private String[] years = {"2024", "2025", "2026", "2027", "2028"};
	
	public AddTaskView()
	{
		initialFrame();
		initialUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public void initialFrame()
	{
		setTitle("New Task");
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
	}
	
	public void initialUI()
	{
		mainPanel.setLayout(new GridLayout(5, 1));
		addTitle();
		addName();
		addType();
		addDeadline();
		addButtons();
		add(mainPanel);
	}

	private void addTitle()
	{
		title = new JLabel("New Task");
		titlePanel.add(title);
		mainPanel.add(titlePanel);
	}
	
	private void addName()
	{
		nameLabel = new JLabel("Name: ");
		nameOfTask = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameOfTask);
		mainPanel.add(namePanel);
	}
	
	private void addType()
	{
		typeLabel = new JLabel("Type: ");
		typeList = new JComboBox(list);
		typePanel.add(typeLabel);
		typePanel.add(typeList);
		mainPanel.add(typePanel);
	}
	
	private void addDeadline()
	{
		deadlineLabel = new JLabel("Deadline: ");
		date = new JComboBox(dates);
		month = new JComboBox(months);
		year = new JComboBox(years);
		deadlinePanel.add(deadlineLabel);
		deadlinePanel.add(date);
		deadlinePanel.add(month);
		deadlinePanel.add(year);
		mainPanel.add(deadlinePanel);
	}
	
	private void addButtons()
	{
		enterButton = new JButton("ENTER");
		cancelButton = new JButton("CANCEL");
		buttonsPanel.add(enterButton);
		buttonsPanel.add(cancelButton);
		mainPanel.add(buttonsPanel);
	}
	
	public static void main(String[] args)
	{
		new AddTaskView();
	}
	
}
