package pkg.owner.overload;

/** when a variables declared in the main class as int 
 * and no integer type overloaded constructor is found
 * java will search for Double loaded method and automaticlly covert int to double and
 * send it to double method.
 * If both not found, then it is compilation error.
 *
 */

class overLoadDemo{
	void overLoad(){
		System.out.println("No Arguments method ");
	}
	/*void overLoad(int a){
		System.out.println("One Argumet method "+a);
	}*/
	void overLoad(int a, int b){
		System.out.println("Two Argument mehod "+a+" "+b);
		}
	double overLoad(double a){
		System.out.println("Double datatype  argument "+a);
		return a;
		
	}
}



public class OverloadExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=88;
		overLoadDemo obj=new overLoadDemo();
		obj.overLoad();
		//obj.overLoad(5);
		obj.overLoad(10, 10);
		obj.overLoad(i);
		double a = obj.overLoad(12.5);
		System.out.print("Thereturned value from the DOUBLE overLoadmethod is "+a);
	}

}
