package basic;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		
		int num = 99;
		boolean isPrime = true;
		for(int i=2 ; i < num/2; i++) {
			if (num%i == 0) {
				isPrime = false;
				break;
			}
			
			
		}
		if (isPrime == true)
			System.out.println("Prime Number");
		else 
			System.out.println("Not a Prime Number");

	}

}
