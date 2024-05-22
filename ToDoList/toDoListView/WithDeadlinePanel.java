package toDoListView;

import java.awt.GridLayout;

import javax.swing.JLabel;

public class WithDeadlinePanel extends TaskPanel
{
	public void setLabels()
	{
		textPanel.setLayout(new GridLayout(2, 1));
		nameLabel = new JLabel();
		deadline = new JLabel();
		textPanel.add(nameLabel);
		textPanel.add(deadline);
	}
}
