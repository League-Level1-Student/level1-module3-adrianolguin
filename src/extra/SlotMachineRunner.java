package extra;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

public class SlotMachineRunner implements ActionListener {

	Random rand = new Random();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	ImageIcon iconC = new ImageIcon("cherry.jpeg");
	ImageIcon iconB = new ImageIcon("bar.jpeg");
	ImageIcon iconS = new ImageIcon("seven.jpeg");

	JButton button = new JButton("SPIN");
	
	

	public static void main(String[] args) {

		SlotMachineRunner machine = new SlotMachineRunner();
		machine.createGUI();
		
		machine.spin();
	}

	void createGUI() {

		label1.setIcon(iconC);
		label2.setIcon(iconB);
		label3.setIcon(iconS);

		button.addActionListener(this);
		
		panel2.add(button);
		
		
		panel.add(label3);
		panel.add(label2);
		panel.add(label1);
		frame.add(panel);
		frame.add(panel2);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(800,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		frame.setLayout(new GridLayout(0,1));
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
		
		
		
		JLabel myLabel = new JLabel();
		
		for(int d = 0; d < 3; d++) {
		
		if(d == 0){
		 myLabel = label1;
		} else if (d == 1) {
		 myLabel = label2;
		}	else if (d == 2) {
		 myLabel = label3;
		}
		
		int x = spin();
		
		if(x == 0) {
			myLabel.setIcon(iconC);
		} else if(x == 1) {
			myLabel.setIcon(iconB);
		} else if(x == 2) {
			myLabel.setIcon(iconS);
		}
			
		}
		
		if(label1.getIcon() == label2.getIcon() && label1.getIcon() == label3.getIcon() && label2.getIcon() == label3.getIcon()) {
		JOptionPane.showMessageDialog(null, "You win");
		}
	}	

	int spin() {
		int x = rand.nextInt(3);	
		
		System.out.print(x);
		
		return x;
		
	}
	

	

}

