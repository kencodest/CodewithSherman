class Casio{
	public void add(int i, int j) {
		System.out.println("sum of "+i+" and "+j+" is: "+(i+j));
	}
	//overloading
	public void add(int i, int j, int k) {
		System.out.println("sum of "+i+" plus "+j+" plus "+k+" is: "+(i+j+k));
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(1,2);
		obj.add(2,3,4);

	}

}
