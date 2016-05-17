package gui.settings.split.left;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import gui.settings.split.right.general.GeneralPanel;
import gui.settings.split.right.style.StylePanel;
import gui.settings.SettingsFrame;

public class StyleButton extends JPanel{
	
	private JButton stylebutton = new JButton("Style");
	
	public StyleButton()
	{
		setLayout(new BorderLayout());
		
//		JButton stylebutton = new JButton("Style");
		stylebutton.setBackground(Color.LIGHT_GRAY);
		stylebutton.setBorder(null);
		stylebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StylePanel stylepanel = new StylePanel();
				JScrollPane jscrollpane = new JScrollPane(stylepanel);
				jscrollpane.setBorder(null);
				SettingsFrame.splitpane.setRightComponent(jscrollpane);
				ActiveButton.activebuttonlist.add(stylebutton);
				ActiveButton.deal();
			}
		});
		add(stylebutton);
	}

}
