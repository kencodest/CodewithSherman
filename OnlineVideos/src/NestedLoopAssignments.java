
public class NestedLoopAssignments {
	//Aim is to build the following patterns using the nested loops
	/*
	 * 1
	 * 1 2
	 * 1 2 3 
	 * 1 2 3 4
	 * 1 2 3 4 5
	 * 1 2 3 4 5 6
	 * 
	 * 
	 * A
	 * A B 
	 * A B C 
	 * 
	 * 
	 * $ $ $ $
	 * $     $
	 * $     $
	 * $ $ $ $ 
	 * 
	 */
	public static void main(String[] args) {
		//Assignment 1
		for(int i=1;i<=6;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j + " ");	
			}
			System.out.println();
		}
		
		
		//Assignment 2
		for(char a=65;a<=67;a++)
		{
			for(char b=65;b<=a;b++)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		//Assignment 3 TO BE FINISHED
		for(int m=1;m<=4;m++)
		{	
			for(int n=1;n<=4;n++)
			{
				if(m==2 && n==2)
				{
					System.out.print("  ");
					continue;
				}
				System.out.print("$ ");	
			}
			System.out.println();
		}
	}
}