package gui.text.split.text;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Text extends JPanel {
	
//	public static String path;  //此文本保存的路径
	private String path = null;
	private JTextArea textArea = new JTextArea();
	
	public Text()
	{
		setLayout(new BorderLayout());
		textArea.setLineWrap(true);  //自动换行
		textArea.setWrapStyleWord(true);  //断行不断字
		textArea.setText(Math.random()*100+"");  //测试  随机数,区分是否唯一
		add(new JScrollPane(textArea));  //滚动条
	}
	
	public void setTextAreaText(String text)
	{
		textArea.setText(text);
	}
	
	public void textareaappend(String text)
	{
		textArea.append(text);
	}

	public String getText()
	{
		return textArea.getText();
	}
	
	public String getPath()
	{
		return this.path;
	}
	
	public void setPath(String path)
	{
		this.path = path;
	}

}