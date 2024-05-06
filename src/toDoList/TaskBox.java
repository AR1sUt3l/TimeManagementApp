package toDoList;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskBox extends JPanel
{
	private int squareX = 100;
	private int squareY = 100;
	private int squareW = 50;
	private int squareH = 50;

	private JCheckBox taskBox;
	private JLabel taskText;
	
	public TaskBox()
	{
		repaint();
	}
	
	public void paint(Graphics g) {
	    g.setColor(Color.black);
	    g.drawRect(squareX,squareY,squareW,squareH);
//	    taskText = new JLabel("Name of Task" + "\n" + "Deadline");
//		taskBox = new JCheckBox();
//		add(taskText);
//		add(taskBox);
	}

	public static void main(String[] args)
	{
		new TaskBox();
	}
}
