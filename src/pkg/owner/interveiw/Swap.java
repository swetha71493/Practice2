package pkg.owner.interveiw;

import java.util.Scanner;

class Test{
	int local=70;
	void display(int i){
		System.out.println("Hai "+i);
	}
	Test(){
		System.out.println("Hai ");
	}
	Test (int a, int b){
		System.out.print(a+" "+b);
	}
	
}

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values for a and b");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b =s.nextInt();
		System.out.println("value of a and b are :"+a+" "+b);
		System.out.println("After swapping:");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b);
		s.close();
		Test obj = new Test();
		//obj.display(10);
		Test obj1=new Test(2,3);
		obj.display(10);
		System.out.print(obj1.local);

	}

}
