package chapter.introclasses;

//Class always use the data that present in the called class, until we specifies from calling class.
class DataHolder {
	int height, length, width;

	void volume() {
		System.out.println("Volume is: " + height * length * width);
	}

	double volumeReturned(int a, int b, int c) {
		System.out.println("Volume is: " + a * b * c);
		return a* b * c;

	}
}
public class MethodsDeclartion{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vol;
		DataHolder obj=new DataHolder();
		obj.height=10;
		obj.length=15;
		obj.width=5;
		obj.volume();
		DataHolder obj1=new DataHolder();
		obj1.height=5;
		obj1.length=7;
		obj1.width=2;
		obj1.volume();
		DataHolder obj3=new DataHolder();
		vol=obj3.volumeReturned(10,20,30);
		System.out.println("Here in main value returned is"+vol);
	}

}
