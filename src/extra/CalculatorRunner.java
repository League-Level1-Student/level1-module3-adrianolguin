package extra;
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
	
	public static void main(String[] args) {
		
	
	CalculatorRunner calc = new CalculatorRunner();
	calc.createUI();
	
	
	
	
	
	
	}
	
	void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.add(field1);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		
		frame.add(panel);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String a = field1.getText();
		String b = field2.getText();
		
		Calculator cal = new Calculator();
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(button1)) {
			
			
			//label.setText(cal.add(g,b);
		}
		
	}
	
}

