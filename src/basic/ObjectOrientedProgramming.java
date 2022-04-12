package basic;

public class ObjectOrientedProgramming {
	
		int x;
		int y;
		void add () {  
			int sum;
			sum = x+y;
			System.out.println(sum);
		}

		int sub() {
		int s;
		s = x - y;
		return s;
		}
		
		
		void multiply(int a, int b) {
			int m = a * b;
			System.out.println(m);
		}
		
	public static void main(String[] args) {
		
		ObjectOrientedProgramming o1 = new ObjectOrientedProgramming();
		o1.x = 10;
		o1.y = 6;
		o1.add ();
		
		
		ObjectOrientedProgramming a2 = new ObjectOrientedProgramming();
		a2.x = 100;
		a2.y = 3;
		a2.add();
		
		ObjectOrientedProgramming b3 = new ObjectOrientedProgramming();
		b3.x = 20;
		b3.y = 5;
		System.out.println(b3.sub ());
		

	}

}







