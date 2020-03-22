
class Addition{
	public int add(int ... n) //Reads the values entered as an array
	{
		int sum=0;
		//using an enhanced for loop to find the sum
		for(int i: n) {
			sum += i;
		}
		return sum;
	}
}
public class VarArgsDemo {

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		//To print the sum of all numbers
		System.out.println(obj.add(2,3,4,5,6,7,8,9));
	}

}
