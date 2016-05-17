package gui.settings.split.left;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	
	public LeftPanel()
	{
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		GeneralButton general = new GeneralButton();
		StyleButton style = new StyleButton();
		
		add(general);
		add(style);
	}

}
