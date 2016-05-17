package deal;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import gui.text.split.buttonlist.ActiveButton;
import gui.text.split.buttonlist.Button;
import gui.text.split.buttonlist.ButtonListPanel;

public class SaveAllFiles {
	
	public SaveAllFiles()
	{
		
	}
	
	public void SAF()
	{
//		System.out.println(ButtonListPanel.buttonlist.size());
		for(int i=0;i<(ButtonListPanel.buttonlist.size());i++)
		{
			try 
			{
				FileOutputStream fos = new FileOutputStream(ButtonListPanel.buttonlist.get(i).getText().getPath());
				
				System.out.println(ButtonListPanel.buttonlist.get(i).getText().getPath());
				
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
				out.write(ButtonListPanel.buttonlist.get(i).getText().getText());
				out.close();
				fos.close();
			}
			catch (Exception ex) 
			{
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
		
	}

}
