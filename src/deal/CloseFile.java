package deal;

import gui.text.EditPanel;
import gui.text.split.buttonlist.ActiveButton;
import gui.text.split.buttonlist.ButtonListPanel;

public class CloseFile {
	
	public CloseFile()
	{
		
	}
	
	public void CF()
	{
//		ActiveButton.thisbutton.setText(""+(Math.random()*100+50-Math.random()*100));
//		ActiveButton.thisbutton.setBackground(Color.WHITE)
		
		ButtonListPanel.buttonlist.remove(ActiveButton.thisbutton);  //? 不知是否有效
		EditPanel.buttonlistpanel.remove(ActiveButton.thisbutton);
		EditPanel.splitpane.setRightComponent(EditPanel.emptypanel);
		EditPanel.buttonlistpanel.reload();;
	}

}
