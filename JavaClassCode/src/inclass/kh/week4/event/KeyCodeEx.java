package inclass.kh.week4.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();
	
	
	public static void main(String[] args) {
		new KeyCodeEx();
	}
	
	public KeyCodeEx() {
		setTitle("keyCode 예제 : F1 초록색, %노란색");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		Container c= getContentPane();
		@Override
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar() == '%') {
				c.setBackground(Color.yellow);
			}else if(e.getKeyCode() == KeyEvent.VK_F1) {
				c.setBackground(Color.green);
			}
		}
		
	}
}
