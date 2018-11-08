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
import javax.swing.JPanel;
import javax.swing.JButton;

public class SlotMachineRunner implements ActionListener {

	Random rand = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	ImageIcon icon = new ImageIcon("cherry.jpeg");
	ImageIcon icon2 = new ImageIcon("cherry.jpeg");
	ImageIcon icon3 = new ImageIcon("cherry.jpeg");

	JButton button = new JButton("SPIN");
	

	public static void main(String[] args) {

		SlotMachineRunner machine = new SlotMachineRunner();
		machine.createGUI();
		
		machine.spin();
	}

	void createGUI() {

		label.setIcon(icon);
		label2.setIcon(icon2);
		label3.setIcon(icon3);

		//button.addActionListener(this);
		button.addActionListener(this);
		
		panel2.add(button);
		
		
		panel.add(label3);
		panel.add(label2);
		panel.add(label);
		frame.add(panel);
		frame.add(panel2);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(0,1));
	}
	
	public void actionPerformed(ActionEvent e) {
		spin();
	}
	

	void spin() {
		int x = rand.nextInt(3);

		System.out.println(x);
	}

}
