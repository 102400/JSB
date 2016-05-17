package gui.settings.split.right.general;

import gui.settings.split.right.general.encoding.NewEncodingPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GeneralPanel extends JPanel{
	
	public GeneralPanel()
	{
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBackground(Color.WHITE);
		
		JLabel encodinglabel = new JLabel("编码");
		NewEncodingPanel newencodingpanel = new NewEncodingPanel();
		

		add(encodinglabel,BorderLayout.WEST);
		add(newencodingpanel);
	}

}
