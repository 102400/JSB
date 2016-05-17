package deal;

import gui.text.split.buttonlist.ActiveButton;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class SaveFile {
	
	public SaveFile()
	{
		
	}
	
	public void SF()
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream(ActiveButton.thisbutton.getText().getPath());
			
			System.out.println(ActiveButton.thisbutton.getText().getPath());
			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
			out.write(ActiveButton.thisbutton.getText().getText());
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
