package oop;

import advance.Addition;
//final= no one can change it.

public class Multiplication extends Addition{
	
	 public static final double pi = 3.14;
	
	void multiple (int a, int b) {
		int m = a*b;
		System.out.println(m);
	}

 static	void multiply (int a, int b, int c) {
		double m = a*b*c*pi;
		System.out.println(m);
	}
	//if the method is static directly
	
	public static void main(String[] args) {
		Multiplication m1 =new Multiplication();
		m1.multiple(10, 10);
		
		
		//10+10+10*10
		int sum = m1.add(10, 10, 10);
		m1.multiple(sum, 10);
		
		multiply(10,10,10);
		
		Addition.add(100);
	}

}
