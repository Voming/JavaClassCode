package inclass.kh.week4.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AnnonymousClassListener extends JFrame{
	public static void main(String[] args) {
		new AnnonymousClassListener();
	}
	
	public AnnonymousClassListener() {
		setTitle("Action lister test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}	
			}
		});
		
		setSize(350,150);
		setVisible(true);
	}

}
