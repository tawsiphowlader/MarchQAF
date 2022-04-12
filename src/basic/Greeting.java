package basic;

public class Greeting {

	public static void main(String[] args) {
		// decision making
		
		String name;
		int time;
		
		name = "Tawsip";
		time = 23;
		
		if (time>0 && time<=12)
		System.out.println("Good Morning "+name);//concatenation 
		else if (time>12 && time<18) //both condition have to filled out
		System.out.println("Good Afternoon "+name);
		else if (time>18 && time<24)
			System.out.println("Good Evening "+name);
		else
			System.out.println("Wrong Time");

	}

}
