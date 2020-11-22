package pkg.owner.interveiw;

import java.util.Scanner;

class Fact{
	int factorial;
	long returnFact(long num){
		if (num==1)
		return 1;
		num=returnFact(num-1)*num;
		return num;		
		
	}
	
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact ob=new Fact();
		//System.out.println("factorial of 5 = " +ob.returnFact(5));
		System.out.println("Enter value to display factorial");
		Scanner s  = new Scanner(System.in);
		long a=s.nextInt();
		long k=ob.returnFact(a);
		System.out.println("Factorial is: "+k);
		s.close();

	}

}
