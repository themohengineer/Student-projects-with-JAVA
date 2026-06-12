package gameWord;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FourthFrame {

	private int countApple = 7;
	private int countBanana = 1;
	
	private int line = 2;
	
	JButton button1 = new JButton("A");
	JButton button2 = new JButton("B");
	JButton button3 = new JButton("N");
	JButton button4 = new JButton("P");
	JButton button5 = new JButton("L");
	JButton button6 = new JButton("E");
	
	//BANANA
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();
		JTextField t6 = new JTextField();
		
		
		//APPLE
		JTextField t7 = new JTextField();
		JTextField t8 = new JTextField();
		JTextField t9 = new JTextField();
		JTextField t10 = new JTextField();
		JTextField t11 = new JTextField();

		
		JLabel label = new JLabel("Guess the fruits name :");
	
	
	
	
	public FourthFrame() {
		
		t11.setBackground(Color.yellow);
		t10.setBackground(Color.yellow);
		t9.setBackground(Color.yellow);
		t8.setBackground(Color.yellow);
		t7.setBackground(Color.yellow);
		
		JFrame f = new JFrame("Start"); 
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JPanel Yel = new JPanel();
		JPanel blak = new JPanel();
		
		Yel.setLayout(new GridLayout());
		blak.setLayout(new GridLayout());
		
		
		blak.setBounds(155, 350, 210, 50);
		Yel.setBounds(155, 420, 250, 50);
		
		
		JTextField score = new JTextField("Score : ");
		score.setBounds(570, 420, 75, 50);
		score.setEditable(false);
		score.setBackground(Color.orange);
		
		
		JButton r2 = new JButton("Record");
		r2.setBounds(430, 350, 80, 50);
		r2.setBackground(Color.green);
		
		JButton r3 = new JButton("Record");
		r3.setBounds(430, 420, 80, 50);
		r3.setBackground(Color.green);
		
		
		
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);
		t9.setEditable(false);
		t10.setEditable(false);
		t11.setEditable(false);

		
		
		f.setBounds(240, 30, 870, 690);
		p1.setBounds(0, 0, f.getWidth(), f.getHeight());
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		
		label.setBounds(155, -28, 200, 200);

		
		
		
		
		p2.setLayout(new GridLayout());
		p2.setBounds(155, 90, 345, 60);
		
		p2.add(button1);
		p2.add(button3);
		p2.add(button5);
		p2.add(button2);
		p2.add(button4);
		p2.add(button6);
		
		p1.add(label);
		
		Yel.add(t1);
		Yel.add(t2);
		Yel.add(t3);
		Yel.add(t4);
		Yel.add(t5);
		Yel.add(t6);
		
		blak.add(t7);
		blak.add(t8);
		blak.add(t9);
		blak.add(t10);
		blak.add(t11);
		

		
		p1.add(score);
		p1.add(blak);
		p1.add(Yel);
		p1.add(p2);
		
		p1.add(r2);
		p1.add(r3);
		
	    f.setLayout(null);    
	    f.setVisible(true);
	    f.add(p1);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    f.setResizable(false);
	    
	    button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l2(button1);
				l3(button1);
			}
		});
	    
	    button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				l2(button2);
				l3(button2);
			}
		});
	    
	    button3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l2(button3);
			l3(button3);
		}
	});

	    button4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l2(button4);
			l3(button4);
			
		}
	});

	    button5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l2(button5);
			l3(button5);
		}
	});

	    button6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l2(button6);
			l3(button6);
			
		}
	});

	    
	    
	    
	    r2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t11.getText().contains("E") && t10.getText().contains("L") && t9.getText().contains("P") && t8.getText().contains("P") && t7.getText().contains("A"))
				{
					JOptionPane.showMessageDialog(null , "successful !");
				    line++;
				    t6.setBackground(Color.yellow);
				    t5.setBackground(Color.yellow);
				    t4.setBackground(Color.yellow);
				    t3.setBackground(Color.yellow);
				    t2.setBackground(Color.yellow);
				    t1.setBackground(Color.yellow);
				    score.setText("Score : 4");
				}
				else
				{
					JOptionPane.showMessageDialog(null , "Wrong !");
					t11.setText(null);
					t10.setText(null);
					t9.setText(null);
					t8.setText(null);
					t7.setText(null);
					countApple = 7;
				}
				
			}
		});
	    
	    
	r3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t6.getText().contains("A") && t5.getText().contains("N") && t4.getText().contains("A") && t3.getText().contains("N") && t2.getText().contains("A") && t1.getText().contains("B"))
				{
					score.setText("Score : 9");
					JOptionPane.showMessageDialog(null , "YOU WIN !\n" + "Your Score in level 2 = 9" );
					JOptionPane.showMessageDialog(null , "You finshed the game ! \n All Score = 21");
				    
				    
				    
				}
				else
				{
					JOptionPane.showMessageDialog(null , "Wrong !");
					t6.setText(null);
					t5.setText(null);
					t4.setText(null);
					t3.setText(null);
					t2.setText(null);
					t1.setText(null);
					countBanana = 1;
					
				}
				
			}
		});
	    
		
		
		
	}
	

	
	public void l2(JButton b)
	{
	if(countApple == 11 && line == 2)
		t11.setText("     " + b.getText());
	else if(countApple == 10 && line == 2)
		t10.setText("     " + b.getText());
	else if(countApple == 9 && line == 2)
		t9.setText("     " + b.getText());
	else if(countApple == 8 && line == 2)
		t8.setText("     " + b.getText());
	else if(countApple == 7 && line == 2)
		t7.setText("     " + b.getText());
	if(line == 2)
	countApple++;
	}
	
	public void l3(JButton b)
	{
	if(countBanana == 6 && line == 3)
		t6.setText("     " + b.getText());
	else if(countBanana == 5 && line == 3)
		t5.setText("     " + b.getText());
	else if(countBanana == 4 && line == 3)
		t4.setText("     " + b.getText());
	else if(countBanana == 3 && line == 3)
		t3.setText("     " + b.getText());
	else if(countBanana == 2 && line == 3)
		t2.setText("     " + b.getText());
	else if(countBanana == 1 && line == 3)
		t1.setText("     " + b.getText());
	if(line == 3)
	countBanana++;
	}
	
	
	
}
