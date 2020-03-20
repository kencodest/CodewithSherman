class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result =num1+num2;
		System.out.println("sum result is: "+result);
	}
	
	//constructor 1 to assign values
	public Calc() {
		num1=5;
		num2=10;
		System.out.println("In contructor 1; num1="+ num1 + " num2="+ num2);
	}
	
	//constructor 2 to assign values
	public Calc(int n1, int n2) {
		num1=n1;
		num2=n2;
		System.out.println("In contructor 2; num1="+ n1  + " num2="+ n2);
		
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(); // creation of a new object
		System.out.println(obj.num1);
		System.out.println(obj.num2=10);
		obj.perform();
		//creation of obj1
		//Calc obj1 = new Calc(2,6);	
		

	}

}
