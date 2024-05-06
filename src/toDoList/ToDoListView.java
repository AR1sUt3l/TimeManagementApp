package toDoList;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDoListView extends JFrame
{
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 600;
	private static final String TITLE = "To Do List";
	private static final String TEXT_FOR_TODAY = "Today";
//	private static final String SEPARATION_LINE
	
	private JPanel _topPanel = new JPanel();
	
	private JLabel _topText;
	private JLabel _lineBreak;
	
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
		setLayout(new FlowLayout());
		addTopText();
	}
	
	private void addTopText()
	{
		_topText = new JLabel(TEXT_FOR_TODAY);
		_topPanel.add(_topText);
		_topPanel.setAlignmentX(LEFT_ALIGNMENT);
		add(_topPanel);
	}
	
	public static void main(String[] args)
	{
		new ToDoListView();
	}
	
}
