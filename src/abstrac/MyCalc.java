package abstrac;

public class MyCalc implements Calc {

	public static void main(String[] args) {
		MyCalc mc1 = new MyCalc(); 
		mc1.add(10, 10);
		mc1.sub(10, 5);
			
		
		

	}

	@Override
	public void add(int a, int b) {
	int sum = a+b;
	System.out.println(sum);
		
	}

	@Override
	public void sub(int a, int b) {
		int s = a-b;
		System.out.println(s);
		
	}

}
