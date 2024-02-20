package inclass.kh.week4.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("나의 첫 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());
		
		cont.add(new JButton("Calculate"),BorderLayout.WEST);
		cont.add(new JButton("Calculate"),BorderLayout.EAST);
		cont.add(new JButton("Calculate"),BorderLayout.CENTER);
		cont.add(new JButton("Calculate"),BorderLayout.NORTH);
	
		//나타대는 코드는 보통 마지막에
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
		
	}
}
