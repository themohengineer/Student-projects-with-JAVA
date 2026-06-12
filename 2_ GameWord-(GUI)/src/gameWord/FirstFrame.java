package gameWord;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstFrame {
	
	public FirstFrame() {
		JFrame f = new JFrame("Start"); 
		JPanel p = new JPanel();
		JButton button1 = new JButton("Start");     
		
		f.setBounds(450, 200, 500, 400);
		p.setBounds(0, 0, f.getWidth(), f.getHeight());
		p.setBackground(Color.blue);
		button1.setBounds(178, 130, 140, 40);
		button1.setBackground(Color.green); 
		p.setLayout(null);
		p.add(button1);
	    f.setLayout(null);    
	    f.setVisible(true);
	    f.add(p);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    f.setResizable(false);
	    
		button1.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent ae) {
			 
				f.dispose();
				new SecondFrame();
				
				
				
			}
		});
		
	}

	
	
}
