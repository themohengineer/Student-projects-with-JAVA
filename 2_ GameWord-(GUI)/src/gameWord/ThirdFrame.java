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





public class ThirdFrame {

	private int countBlue = 12;
	private int countBack = 7;
	private int countyellow = 1;
	
	private int line = 1;
	
	JButton button1 = new JButton("A");
	JButton button2 = new JButton("B");
	JButton button3 = new JButton("C");
	JButton button4 = new JButton("E");
	JButton button5 = new JButton("O");
	JButton button6 = new JButton("K");
	JButton button7 = new JButton("U");
	JButton button8 = new JButton("W");
	JButton button9 = new JButton("L");
	JButton button10 = new JButton("Y");
	
	//wellow
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();
		JTextField t6 = new JTextField();
		
		//black
		JTextField t7 = new JTextField();
		JTextField t8 = new JTextField();
		JTextField t9 = new JTextField();
		JTextField t10 = new JTextField();
		JTextField t11 = new JTextField();
		
		//blue
		JTextField t12 = new JTextField();
		JTextField t13 = new JTextField();
		JTextField t14 = new JTextField();
		JTextField t15 = new JTextField();
		
		JLabel label = new JLabel("Guess the colors name :");
		
	public ThirdFrame()
	{
	
		
	
		
	JFrame f = new JFrame("Start"); 
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JPanel Yel = new JPanel();
	JPanel blak = new JPanel();
	JPanel blu = new JPanel();
	
	Yel.setLayout(new GridLayout());
	blak.setLayout(new GridLayout());
	blu.setLayout(new GridLayout());
	
	blu.setBounds(155, 280, 170, 50);
	blak.setBounds(155, 350, 210, 50);
	Yel.setBounds(155, 420, 250, 50);
	
	
	t15.setBackground(Color.yellow);
    t14.setBackground(Color.yellow);
    t13.setBackground(Color.yellow);
    t12.setBackground(Color.yellow);
	
	
	JTextField score = new JTextField("Score : ");
	score.setBounds(570, 420, 75, 50);
	score.setEditable(false);
	score.setBackground(Color.orange);
	
	JButton r1 = new JButton("Record");
	r1.setBounds(430, 280, 80, 50);
	r1.setBackground(Color.green);
	
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
	t12.setEditable(false);
	t13.setEditable(false);
	t14.setEditable(false);
	t15.setEditable(false);
	
	
	f.setBounds(240, 30, 870, 690);
	p1.setBounds(0, 0, f.getWidth(), f.getHeight());
	p1.setBackground(Color.blue);
	p1.setLayout(null);
	
	
	label.setBounds(155, -28, 200, 200);

	
	
	
	
	p2.setLayout(new GridLayout());
	p2.setBackground(Color.gray);
	p2.setBounds(155, 90, 550, 60);
	
	p2.add(button1);
	p2.add(button3);
	p2.add(button5);
	p2.add(button2);
	p2.add(button4);
	p2.add(button6);
	p2.add(button7);
	p2.add(button8);
	p2.add(button9);
	p2.add(button10);
	
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
	
	blu.add(t12);
	blu.add(t13);
	blu.add(t14);
	blu.add(t15);
	

	
	p1.add(score);
	p1.add(blu);
	p1.add(blak);
	p1.add(Yel);
	p1.add(p2);
	
	p1.add(r1);
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
			l1(button1);
			l2(button1);
			l3(button1);
		}
	});
    
    button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l1(button2);
			l2(button2);
			l3(button2);
		}
	});
    
    button3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button3);
		l2(button3);
		l3(button3);
	}
});

    button4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button4);
		l2(button4);
		l3(button4);
		
	}
});

    button5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button5);
		l2(button5);
		l3(button5);
	}
});

    button6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button6);
		l2(button6);
		l3(button6);
		
	}
});

    button7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button7);
		l2(button7);
		l3(button7);
		
	}
});

    button8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button8);
		l2(button8);
		l3(button8);
	}
});

    button9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l1(button9);
		l2(button9);
		l3(button9);
		
		
	}
});

    button10.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			l1(button10);
			l2(button10);
			l3(button10);
		}
	});
    
    
    
    r1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(t15.getText().contains("E") && t14.getText().contains("U") && t13.getText().contains("L") && t12.getText().contains("B"))
			{
				JOptionPane.showMessageDialog(null , "successful !");
			    line++;
			    t11.setBackground(Color.yellow);
			    t10.setBackground(Color.yellow);
			    t9.setBackground(Color.yellow);
			    t8.setBackground(Color.yellow);
			    t7.setBackground(Color.yellow);
			    score.setText("Score : 3");
			}
			else
			{
				JOptionPane.showMessageDialog(null , "Wrong !");
				t12.setText(null);
				t13.setText(null);
				t14.setText(null);
				t15.setText(null);
				countBlue = 12;
			}
		}
	});
    
    
    
    r2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(t11.getText().contains("K") && t10.getText().contains("C") && t9.getText().contains("A") && t8.getText().contains("L") && t7.getText().contains("B"))
			{
				JOptionPane.showMessageDialog(null , "successful !");
			    line++;
			    t6.setBackground(Color.yellow);
			    t5.setBackground(Color.yellow);
			    t4.setBackground(Color.yellow);
			    t3.setBackground(Color.yellow);
			    t2.setBackground(Color.yellow);
			    t1.setBackground(Color.yellow);
			    score.setText("Score : 7");
			}
			else
			{
				JOptionPane.showMessageDialog(null , "Wrong !");
				t11.setText(null);
				t10.setText(null);
				t9.setText(null);
				t8.setText(null);
				t7.setText(null);
				countBack = 11;
			}
			
		}
	});
    
    
r3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(t6.getText().contains("W") && t5.getText().contains("O") && t4.getText().contains("L") && t3.getText().contains("L") && t2.getText().contains("E") && t1.getText().contains("Y"))
			{
				score.setText("Score : 12");
				JOptionPane.showMessageDialog(null , "YOU WIN !\n" + "Your Score in level 1 = 12");
				JOptionPane.showMessageDialog(null , "Next level !");
			    f.dispose();
			    new FourthFrame();
			    
			    
			    
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
				countyellow = 1;
				
			}
			
		}
	});
    
    
    
	}
	
	
	public void l1(JButton b)
	{
		if(countBlue == 15 && line == 1)
			t15.setText("     " + b.getText());
		else if(countBlue == 14 && line == 1)
			t14.setText("     " + b.getText());
		if(countBlue == 13 && line == 1)
			t13.setText("     " + b.getText());
		else if(countBlue == 12 && line == 1)
			t12.setText("     " + b.getText());
		if(line == 1)
		countBlue++;
	}
	
	
	
	public void l2(JButton b)
	{
	if(countBack == 11 && line == 2)
		t11.setText("     " + b.getText());
	else if(countBack == 10 && line == 2)
		t10.setText("     " + b.getText());
	else if(countBack == 9 && line == 2)
		t9.setText("     " + b.getText());
	else if(countBack == 8 && line == 2)
		t8.setText("     " + b.getText());
	else if(countBack == 7 && line == 2)
		t7.setText("     " + b.getText());
	if(line == 2)
	countBack++;
	}
	
	public void l3(JButton b)
	{
	if(countyellow == 6 && line == 3)
		t6.setText("     " + b.getText());
	else if(countyellow == 5 && line == 3)
		t5.setText("     " + b.getText());
	else if(countyellow == 4 && line == 3)
		t4.setText("     " + b.getText());
	else if(countyellow == 3 && line == 3)
		t3.setText("     " + b.getText());
	else if(countyellow == 2 && line == 3)
		t2.setText("     " + b.getText());
	else if(countyellow == 1 && line == 3)
		t1.setText("     " + b.getText());
	if(line == 3)
	countyellow++;
	}
	
	
	
	
	
	
	
}
