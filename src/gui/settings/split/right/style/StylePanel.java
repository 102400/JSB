package gui.settings.split.right.style;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StylePanel extends JPanel {
	
	public StylePanel()
	{
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBackground(Color.WHITE);
		
		JLabel jlabel = new JLabel("?");
		add(jlabel);
	}

}
