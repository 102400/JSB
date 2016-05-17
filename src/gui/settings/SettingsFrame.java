package gui.settings;

import gui.main.MenuBar;
import gui.main.Panel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import gui.settings.split.SplitPane;
import gui.settings.split.left.LeftPanel;
import gui.settings.split.right.RightPanel;

public class SettingsFrame extends JFrame {
	
	private static JScrollPane jscrollpane;
	public static SplitPane splitpane;
	
	static
	{
		jscrollpane = new JScrollPane(new LeftPanel());
		jscrollpane.setBorder(null);
		splitpane = new SplitPane(JSplitPane.HORIZONTAL_SPLIT,jscrollpane,new RightPanel());
	}
	
	public SettingsFrame()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		add(splitpane);
//		Panel panel = new Panel();  //内容
//		MenuBar menubar = new MenuBar(panel);  //菜单栏
//		setJMenuBar(menubar);
//		setContentPane(panel);
	}

}
