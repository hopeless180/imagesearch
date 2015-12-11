import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class MyFrame1 extends Frame
implements ActionListener
{	
	//定义界面1的两个按钮元素
	JButton JB1 = new JButton("生成特征码");
	JButton JB2 = new JButton("开始搜索");
	
	//主界面的构造方法
	public MyFrame1(){
		this.setTitle("图像形状搜索系统");
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
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == JB2){
			new MyFrame2();
		}
	}

}
