package gui.main;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import gui.settings.SettingsFrame;
import gui.help.welcome.Welcome;

public class MenuBar extends JMenuBar {
	
	private Panel panel;
	
	public MenuBar()
	{
		
	}
	
	public MenuBar(Panel panel)
	{
//		JMenuBar menuBar = new JMenuBar();
//		setJMenuBar(menuBar);
		this.panel = panel;
		
		JMenu settings_main = new JMenu("设置");
		add(settings_main);
		
		JMenuItem settings = new JMenuItem("设置");
		settings.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					SettingsFrame settingsframe = new SettingsFrame();
					settingsframe.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		settings_main.add(settings);
		
		
		JMenu menu_Help = new JMenu("帮助");
		add(menu_Help);
		
		JMenuItem textmain = new JMenuItem("Main");
		textmain.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setAdd(Panel.editpanel);
			}
		});
		menu_Help.add(textmain);
		
		JMenuItem menuitem_Welcome = new JMenuItem("欢迎");
		menuitem_Welcome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setAdd(Panel.welcome);
			}
		});
		menu_Help.add(menuitem_Welcome);
		
		JMenuItem menuitem_Updates = new JMenuItem("更新");
		menuitem_Updates.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setAdd(Panel.updates);
			}
		});
		menu_Help.add(menuitem_Updates);
		
		JMenuItem menuitem_About = new JMenuItem("关于");
		menuitem_About.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setAdd(Panel.about);
			}
		});
		menu_Help.add(menuitem_About);
	}

}
