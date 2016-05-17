package deal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

import gui.StaticData;
import gui.text.EditPanel;
import gui.text.split.buttonlist.ActiveButton;
import gui.text.split.buttonlist.Button;
import gui.text.split.buttonlist.ButtonListPanel;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.ProgressMonitorInputStream;

public class OpenFile {
	
	public OpenFile()
	{
		
	}
	
	public void OF()
	{
		JFileChooser filechooser = new JFileChooser();
//		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  //只能选择文件
//		filechooser.showOpenDialog(StaticData.frame);
		Button button = null;
		
		if (JFileChooser.APPROVE_OPTION == filechooser.showOpenDialog(StaticData.frame))  //用户点击了确定   
		{
    		try 
    		{
    			String temp_path = filechooser.getSelectedFile().getAbsolutePath();  //取得路径选择 
//    			ActiveButton.thisbutton.getText().path = temp_path;
//              System.out.println(temp_path);
    			ButtonListPanel.buttonlist.add(button = new Button());
//    			if(ActiveButton.thisbutton!=null)
//    			{
//    				ActiveButton.thisbutton.getText().path = temp_path;
//    			}
//    			else
//    			{
//    				ActiveButton.thisbutton = button;
//    				ActiveButton.thisbutton.getText().path = temp_path;
//    			}
    			
    			ActiveButton.thisbutton = button;
				ActiveButton.thisbutton.getText().setPath(temp_path);
//    			EditPanel.buttonlistpanel.add(ButtonListPanel.buttonlist.getLast(),0);
      		
				if (temp_path != null) 
				{
					FileInputStream fis = new FileInputStream(temp_path);
					button.getText().setTextAreaText("");
					
//					File f = filechooser.getSelectedFile();
					
					InputStreamReader input = new InputStreamReader(fis,"utf-8");
//					InputStream input = Files.newInputStream(f.toPath());
					
//					ProgressMonitorInputStream progressmi = new ProgressMonitorInputStream(StaticData.frame, "aaa", input);  //读取文件进度条
					//进度条非常影响读取速度?
					//
					
					BufferedReader in = new BufferedReader(input);  //传入文件的编码设置
//					Scanner in = new Scanner(progressmi);  //传入文件的编码设置
					StringBuilder sb = new StringBuilder();  //StringBuilder比StringBuffer更快 16s:19s
					String s = null;
//					while (in.hasNextLine()) 
					while ((s = in.readLine()) != null) 
					{
//						s = in.nextLine();
						sb.append(s + "\r\n");
//						button.getText().textareaappend(s + "\r\n");
					}
					button.getText().setTextAreaText(sb.toString());
//					for (int i = 0; i < 4; i++) // 增加空行
//					{
//						text.append("\r\n");
//					}
					in.close();
					input.close();
					fis.close();
				}
			} 
    		catch (Exception ex) 
    		{
    			ex.printStackTrace();
			}

    		EditPanel.buttonlistpanel.add(ButtonListPanel.buttonlist.getLast(),0);
    		
    		button.setButtonText(filechooser.getSelectedFile().getName());  //设置button.text为打开文件名
    		
    		ActiveButton setthisbutton = new ActiveButton(button);
    		setthisbutton.STB();
    		
    		EditPanel.buttonlistpanel.reload();
        }  
		
	}

}
