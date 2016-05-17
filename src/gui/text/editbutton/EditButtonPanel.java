package gui.text.editbutton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import deal.CloseAllFiles;
import deal.CloseFile;
import deal.NewText;
import deal.OpenFile;
import deal.SaveAllFiles;
import deal.SaveAs;
import deal.SaveFile;

public class EditButtonPanel extends JPanel {
	
	public EditButtonPanel()
	{
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		JButton newtextbutton = new JButton();
		newtextbutton.setText("新建");
		newtextbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewText newtext = new NewText();
				newtext.NT();
//				ButtonListPanel.buttonlist.add(new Button());
//				EditPanel.buttonlistpanel.add(ButtonListPanel.buttonlist.getLast(),0);
//				EditPanel.buttonlistpanel.reload();
			}
		});
		
		JButton openfilebutton = new JButton();
		openfilebutton.setText("打开");
		openfilebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OpenFile openfile = new OpenFile();
				openfile.OF();
				
			}
		});
		
		JButton jb2 = new JButton();  //未完成
		jb2.setText("另存为");
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SaveAs saveas = new SaveAs();
				saveas.SA();
			}
		});
		
		JButton savefilebutton = new JButton();
		savefilebutton.setText("保存");
		savefilebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SaveFile savefile = new SaveFile();
				savefile.SF();
			}
		});
		
		JButton saveallfilesbutton = new JButton();
		saveallfilesbutton.setText("全部保存");
		saveallfilesbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SaveAllFiles saveallfiles = new SaveAllFiles();
				saveallfiles.SAF();
			}
		});
		
		JButton closefilebutton = new JButton();
		closefilebutton.setText("关闭");
		closefilebutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CloseFile closefile = new CloseFile();
				closefile.CF();
				
			}
		});
		
		JButton closeallfilesbutton = new JButton();
		closeallfilesbutton.setText("全部关闭");
		closeallfilesbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CloseAllFiles closeallfiles = new CloseAllFiles();
				closeallfiles.CAF();
			}
		});
		
		
		add(newtextbutton);
		add(openfilebutton);
		add(jb2);
		add(savefilebutton);
		add(saveallfilesbutton);
		add(closefilebutton);
		add(closeallfilesbutton);
	}

}
