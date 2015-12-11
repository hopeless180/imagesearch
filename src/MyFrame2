import java.awt.event.ActionListener;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import MyPack.ImageEdge;

public class MyFrame2 extends Frame
implements ActionListener
{
	//定义文件名和文件位置信息
	String filename, filepath;
	
	//定义界面2的两个按钮元素
	JButton JB1 = new JButton("以文本搜索");
	JButton JB2 = new JButton("以图像搜索");
	
	//界面2的构造函数
	public MyFrame2(){
		this.setTitle("选择搜索方式");
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(10, 10, 400, 250);
		//按钮1的定义
		JB1.setBounds(100, 50, 200, 50);
		this.add(JB1);
		JB1.addActionListener(this);
		//按钮2的定义
		JB2.setBounds(100, 150, 200, 50);
		this.add(JB2);
		JB2.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== JB2){
			//打开图片
			JFileChooser jfc=new JFileChooser("./input");
			jfc.setFileSelectionMode(JFileChooser.FILES_ONLY );
			jfc.showDialog(new JLabel(), "选择");
			File file=jfc.getSelectedFile();
			if(file.isFile()){
				filepath = jfc.getSelectedFile().getAbsolutePath();
				filename = jfc.getSelectedFile().getName();
			}
			//todo 后面是生成特征码的循环
		}
	}
}

