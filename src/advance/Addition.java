package advance;

public class Addition {

	private int x;// instance variable
	private int y;
	
	//1.Inheritance 2. Poly-morphism (methode overloading / method overriding) 3.Encapsulation 4. Abstraction
	
	 public void add() {
		int sum = x+y;
		System.out.println(sum);
	}
	
	protected int add (int a, int b, int c) {
		int sum; //local variable
		sum = a+b+c;
		return sum;
	}
	
	double add(double a, double b, double c) {
		double sum;
		sum = a+b+c;
		return sum;
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition(); //object: i make it with new
		a1.x = 100;
		a1.y = 50;
		
		a1.add();
		
		int sum1 = a1.add(10, 10, 10);
		System.out.println(sum1);
		
		double sum2 = a1.add(10.50, 10.75, 10.58);
		System.out.println(sum2);
		
		int sum3 = a1.add(100, 100, 100);
		System.out.println(sum3);
	}

}
