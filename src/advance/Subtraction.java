package advance;

public class Subtraction extends Addition {
	
	void sub(int a, int b) {
		int s = a- b;
		System.out.println(s);	
		//when we need a inheritance? when we need a access a method from a different class. "extence"
		// why we need inheritance? so can child method can access parents method
	}	//access modifier -1.private--only accessible with class. 2. public- accessible within project 
		//level. 3. default- accessible within package. 4. protected - access within package but 
		//accessible outside page if the class is inheritated.
						
	
	
	double add(double a, double b, double c) {
		double sum;
		sum = a+b+c+5.0;
		return sum;
	}
	
	

	public static void main(String[] args) {
		
		Subtraction s1 = new Subtraction();
		s1.sub(100,50);
		
		//100+100+100-50
		int sum = s1.add(100, 100, 100);
		s1.sub(sum, 50); 
		//final, statatic
		
		
		
		double sum2 = s1.add(10.5, 10.6, 10.7);
		System.out.println(sum2);//16 march: finish en-capsul-ation and abstraction
		
		
		//Subtraction s2 = new Subtraction();
		
	}

}
