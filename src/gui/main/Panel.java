package gui.main;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import gui.help.about.About;
import gui.help.updates.Updates;
import gui.help.welcome.Welcome;
import gui.text.EditPanel;

public class Panel extends JPanel{
	
	public static final Welcome welcome = new Welcome();  //修改
	public static final About about = new About();
	public static final Updates updates = new Updates();
//	public static final TabbedPane tabbedpane = new TabbedPane(JTabbedPane.SCROLL_TAB_LAYOUT);
	public static final EditPanel editpanel = new EditPanel();
	
	private Frame frame;
	
	public Panel()
	{
		this.frame = frame;
		setLayout(new BorderLayout());
//		add(shell);
		add(editpanel);  //默认显示
	}
	
	public void setAdd(JPanel show)  //设置显示的panel
	{
		show.setVisible(false);
		removeAll();
		add(show);
		show.setVisible(true);
		repaint();
	}
	
//	public void setAdd(JTabbedPane show)  //设置显示的panel
//	{
//		show.setVisible(false);
//		removeAll();
//		add(show);
//		show.setVisible(true);
//		repaint();
//	}

}
