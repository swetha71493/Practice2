package pkg.owner.overload;
/** If we create an object, the default constructor will be called automatically
 * but if we are defining a parameterized constructor, we should declare the default constructor
 * before creating object for that class (with 0 parameters). 
 */

class Second{
	int width, height, depth;
	
	Second(){
		System.out.println("Default constructor is invoked");
		System.out.println("Dimenstions are: " +width+" "+height+" "+depth);
	}
	
	Second (int w, int h, int d){
		width=w;
		height=h;
		depth=d;
		System.out.println("Dimenstions are: "+width+" "+height+" "+depth);
	
}

	Second(int k){
		width=height=depth=k;
		System.out.println("Dimension is: "+width);
	}
	int display(){
		return width*height*depth;
	}
}
 class ConstructorExample{
	 public static void main(String args[]){
		 Second obj=new Second();
		 Second obj2 = new Second(2,3,4);
		 Second obj3 = new Second(5);
		int vol = obj.display();
		System.out.println("Volume of the cube with no dimensions:"+vol);
		int vol2=obj2.display();
		System.out.println("Volume of the cube with three dimensions:"+vol2);
		int vol3=obj3.display();
		System.out.println("Volume of the cube with one dimensions:"+vol3);
		 
		 
	 }
	 
	
}