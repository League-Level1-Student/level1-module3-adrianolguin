import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {

		int r = new Random().nextInt(4);
		String input = JOptionPane.showInputDialog("Ask a question to the magic 8 Ball!");

		if (r == 0) {
			System.out.println("Yes");
		} else if (r == 1) {
			System.out.println("No");
		} else if (r == 2) {
			System.out.println("Maybe you should ask google?");
		} else {
			System.out.println("Maybe in a million years");
		}
	}
}
