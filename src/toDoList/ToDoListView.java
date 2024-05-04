package toDoList;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDoListView extends JFrame
{
	private static final String TITLE = "To Do List";
	private static final String TEXT_FOR_TODAY = "Today";
	
	private JPanel _panel = new JPanel();
	private JLabel _topText;
	
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
	}
	
	private void initialUI()
	{
		setLayout(new FlowLayout());
		addTopText();
	}
	
	private void addTopText()
	{
		_topText = new JLabel(TEXT_FOR_TODAY);
		_panel.add(_topText);
		add(_panel);
	}
	
}
