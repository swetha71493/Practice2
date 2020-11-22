package pkg.owner.overload;

/** 
 * @author Swetha
 * object can be used as parameters in constructor to initialize the values.
 */

class Box{
	int width,height,depth;
	
	Box(){
		System.out.println("Default constructor is invoked");
		System.out.println("Dimenstions are: " +width+" "+height+" "+depth);
	}
	Box(int d){
		width=height=depth=d;
		System.out.println("Dimenstions are: " +width+" "+height+" "+depth);
	}
	Box(Box o){
		width=o.width;
		height=o.height;
		depth=o.width;
		System.out.println("Dimenstions are: " +width+" "+height+" "+depth);
	}
	
	int display(){
		return width*height*depth;
	}
}

public class ObjAsPrmtrsInConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling default constructor
		Box ob=new Box();
		int vol =  ob.display();
		System.out.println(vol);
		//calling one parameterized constructor
		Box ob1=new Box(10);
		int vol2 =  ob1.display();
		System.out.println(vol2);
		//passing an object to the constructor
		Box ob2=new Box(ob1);
		int vol3 =  ob2.display();
		System.out.println(vol3);
		
				
		
		

	}

}
