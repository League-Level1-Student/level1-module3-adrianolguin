package extra;

import java.util.Random;

public class SlotMachine {
	Random rand1 = new Random();
	// Random rand2 = new Random();
	// Random rand3 = new Random();
	
	
	int prizePicker() {
		int r = rand1.nextInt(3);
		return r;
		

	}

}
