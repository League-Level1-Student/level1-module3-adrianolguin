package extra;


public class Calculator {

	void mult(String a, String b) {
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int c = x*y;
		System.out.println(c);
	}
	
	void div(int a, int b){
		int c = a/b;
		System.out.println(c);
	}
	
	void add(String string, String string2) {
		int x = Integer.parseInt(string);
		int y = Integer.parseInt(string2);
		int c = x*y;
		System.out.println(c);
	}
	
	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
	
	
	Calculator(){
		
	}
	
	
	
	
}
