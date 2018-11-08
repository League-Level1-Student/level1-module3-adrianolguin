package extra;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {
	JLabel label = new JLabel();
	
	JButton button1 = new JButton("Add");
	JButton button2 = new JButton("Sub");
	JButton button3 = new JButton("Mult");
	JButton button4 = new JButton("Div");
	
	JTextField field1 = new JTextField(15);
	JTextField field2 = new JTextField(15);
	int wx = 375;
	int wy = 200;
	
	public static void main(String[] args) {
		
	
	CalculatorRunner calc = new CalculatorRunner();
	calc.createUI();
	
	}
	
	void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(wx,wy));
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(wx,wy));
	
		
		panel.add(field1);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		
		frame.add(panel);
			frame.pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String num1 = field1.getText();
		String num2 = field2.getText();
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		Calculator cal = new Calculator();
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(button1)) {
			int c = cal.add(a, b);
			label.setText("" + c);
		} else if(buttonPressed.equals(button2)) {
			int c = cal.sub(a, b);
			label.setText("" + c);
		} else if(buttonPressed.equals(button3)) {
			int c = cal.mult(a, b);
			label.setText("" + c);
		} else if(buttonPressed.equals(button4)) {
			int c = cal.div(a, b);
			label.setText("" + c);
		} 
	}
}

