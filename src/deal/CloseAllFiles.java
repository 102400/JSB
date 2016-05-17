package deal;

import gui.text.EditPanel;
import gui.text.split.buttonlist.ActiveButton;
import gui.text.split.buttonlist.ButtonListPanel;

public class CloseAllFiles {
	
	public CloseAllFiles()
	{
		
	}
	
	public void CAF()
	{
		ButtonListPanel.buttonlist.clear();
		EditPanel.buttonlistpanel.removeAll();
		EditPanel.splitpane.setRightComponent(EditPanel.emptypanel);
		EditPanel.buttonlistpanel.reload();;
	}

}
