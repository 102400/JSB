package gui.settings.split.right.general.encoding;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewEncodingPanel extends JPanel {
	
	public NewEncodingPanel()
	{
		setBackground(Color.WHITE);
		JLabel newencodinglabel = new JLabel("新建编码");
		
		
		
		add(newencodinglabel,BorderLayout.WEST);
	}

}
