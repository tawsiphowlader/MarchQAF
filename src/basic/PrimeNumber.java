package basic;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int num = 17;
		
		boolean isPrime = true;
		
		
		for (int i=2; i<num; i++) {
			if (num%i==0)
				isPrime = false;
			
		}//end for
		
		if (isPrime == true)
			System.out.println("it is a prime number");
		else
			System.out.println("it ia not a prime number");
		

	}

}
