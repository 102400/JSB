package gui.main;

import gui.StaticData;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public Frame()
	{
		StaticData.frame = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		Panel panel = new Panel();  //内容
		MenuBar menubar = new MenuBar(panel);  //菜单栏
		setJMenuBar(menubar);
		setContentPane(panel);
	}
}
