package gui.settings.split.left;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import gui.settings.split.right.general.GeneralPanel;
import gui.settings.SettingsFrame;

public class GeneralButton extends JPanel{
	
	private JButton generalbutton = new JButton("General");
	
	public GeneralButton()
	{
		setLayout(new BorderLayout());
		
//		JButton generalbutton = new JButton("General");
		generalbutton.setBackground(Color.LIGHT_GRAY);
		generalbutton.setBorder(null);
		generalbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GeneralPanel generalpanel = new GeneralPanel();
				JScrollPane jscrollpane = new JScrollPane(generalpanel);
				jscrollpane.setBorder(null);
				SettingsFrame.splitpane.setRightComponent(jscrollpane);
				ActiveButton.activebuttonlist.add(generalbutton);
				ActiveButton.deal();
			}
		});
		add(generalbutton);
		
	}

}
