
public class SelectionDemo {

	public static void main(String[] args) {
		// if -else conditional
		int n=0;
		if(n==0)
		{
			System.out.println("0 is not classified");
		}
			
		else if(n%2==0) 
		{
			System.out.println("This is an even number");

		}
		else 
		{
			System.out.println("This is an odd number");
		}
		
		int i=3,j;
		j=i>5?1:2;
		System.out.println(j);
		
		//switch statement
		
		int k= 8;
		switch(k)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No Match");
			
			
		}
	}

}
