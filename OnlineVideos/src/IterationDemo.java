
public class IterationDemo {
	//while, do while, for, for-each
	public static void main(String[] args) {
		// while loop
		int i=1;
		while(i<=2)
		{
			System.out.println("Hello!!");
			i++;
		}
		

		//do while loop. The condition is executed at least once
		int j=3;
		do
		{
			System.out.println("Hello there!!");
			j++;
		}while(j<=4);
		
		//for loop. Does what a while and do-while loop does in one line
		for(int k=1;k<=2;k++)
		{
			System.out.println("Hello there folks!!");
		}
		
		//nested loop
		//Aim is to print the following box of stars
		/*
		 *  * * * *
		 *  * * * *
		 *  * * * *
		 *  * * * *
		 * 
		 */
		for(i=1;i<=4;i++) 
		{
			for(j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println(i + " ");//print a new line
		}
	}

}
