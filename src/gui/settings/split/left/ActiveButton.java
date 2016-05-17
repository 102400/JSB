package gui.settings.split.left;

import java.awt.Color;
import java.util.LinkedList;

import javax.swing.JButton;

public class ActiveButton {
	
	public static LinkedList<JButton> activebuttonlist = new LinkedList<>();
	
	public ActiveButton()
	{
		
	}
	
	public static void deal()
	{
		setButtonNormal();
		setButtonActive();
	}
	
	private static void setButtonNormal() {
		// TODO Auto-generated method stub
		try
		{
			activebuttonlist.get(activebuttonlist.size()-2).setBackground(Color.LIGHT_GRAY);
		}
		catch(Exception ex)
		{
			
		}
	}

	private static void setButtonActive() {
		// TODO Auto-generated method stub
		activebuttonlist.getLast().setBackground(Color.WHITE);
	}

}
