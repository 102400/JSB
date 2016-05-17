package gui.settings.split;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JSplitPane;

public class SplitPane extends JSplitPane {
	
	public SplitPane()
	{
		
	}
	
	public SplitPane(int newOrientation,Component newLeftComponent,Component newRightComponent)
	{
		super(newOrientation,newLeftComponent,newRightComponent);
//		setDividerLocation(20);
//		setDividerLocation(100);  //设置分隔条的位置
//		setDividerLocation(0.2);
		setDividerSize(0);
		setBackground(Color.WHITE);
		setBorder(null);
	}

}
