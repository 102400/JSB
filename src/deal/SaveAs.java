package deal;

import gui.StaticData;
import gui.text.split.buttonlist.ActiveButton;
import gui.text.split.buttonlist.Button;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;

public class SaveAs {
	
	public SaveAs()
	{
		
	}
	
	public void SA()
	{
		JFileChooser filechooser = new JFileChooser();
//		Button button = null;
		if (JFileChooser.APPROVE_OPTION == filechooser.showSaveDialog(StaticData.frame))  //用户点击了确定   
		{
			try 
			{
				String temp_path = filechooser.getSelectedFile().getAbsolutePath();
				FileOutputStream fos = new FileOutputStream(temp_path);
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
				out.write(ActiveButton.thisbutton.getText().getText());
				out.close();
				fos.close();
//				ActiveButton.thisbutton = button;
				ActiveButton.thisbutton.getText().setPath(temp_path);
				
				ActiveButton.thisbutton.setButtonText(filechooser.getSelectedFile().getName());
			}
			catch (Exception ex) 
			{
			// TODO Auto-generated catch block
			ex.printStackTrace();
			}
		}
	}

}
