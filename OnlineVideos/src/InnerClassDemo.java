//This is a demonstration of using a class within a class

class Outer
{
	public static  void show() {
		System.out.println("in show() outer class");
	}
	
	static class Inner
	{
		public void display() {
			System.out.println("in display () inner class");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();// created an object of the outer class
		obj.show();
		//we now need to access the method display() in the inner class
		Outer.Inner obj1= new Outer.Inner();
		obj1.display();
		

	}

}
