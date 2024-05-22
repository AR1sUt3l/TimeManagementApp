package toDoListView;

import java.awt.GridLayout;

import javax.swing.JLabel;

public class WithoutDeadlinePanel extends TaskPanel
{
	public void setLabels()
	{
		nameLabel = new JLabel();
		textPanel.add(nameLabel);
	}
}
