package gameWord;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecondFrame {
	
	SecondFrame(){
		JFrame f=new JFrame("Hangman"); 
		JPanel p = new JPanel();
		
		 JLabel imge = new JLabel(new ImageIcon("imge.png")) ;
		    imge.setBounds(14,50,470,380);
	                 
		    JLabel label = new JLabel();       
		    label.setText("Enter Your Name :");
		    label.setBounds(15,40, 200,20);

		    JTextField textfield= new JTextField(); 
		    textfield.setBounds(121,37,200,30);

		    JButton b = new JButton("Confirm");  
		    b.setBounds(111,75, 220, 30); 
		    b.setBackground(Color.orange);               
	        JLabel label1 = new JLabel();
		    label1.setBounds(10,280, 300, 100);
		    label1.setForeground(Color.RED); 
		    
		    f.setBounds(450, 200, 500, 400);
			p.setBounds(0, 0, f.getWidth(), f.getHeight());
		    p.setBackground(Color.gray);
		   
		    
		    
		    p.add(imge);
		    p.add(label1);
		    p.add(textfield);
		    p.add(label);
		    p.add(b);   
		    p.setLayout(null);
		    f.setLayout(null);    
		    f.setVisible(true);    
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		    f.add(p);    
		    f.setResizable(false);
		    b.addActionListener(new ActionListener() {
		            
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		    	label1.setText("Welcome"+ "''" + textfield.getText() + "''." +" " + "Let's Start The Game!!");
	            textfield.setText("");
	            
		    }          
	          });
	
	            b.addActionListener(new ActionListener() {   
	    			public void actionPerformed(ActionEvent ae) {
	    				f.dispose();
	    				new ThirdFrame();
		             
	    			}
	    		});
	    		
	    	}

	    
		
		
		
		
		
		
		
		
		


	
}
