
class Student
{
	int rollno;
	String name;
	
	public void show() {
		System.out.println("Student rollno:"+rollno+" Name: "+ name);
	}
}
public class ArrayDemo {

	public static void main(String[] args) {
		// 1D Array
		int nums[] = {1,2,3,4,5};
		
		//To print out all elements
		System.out.println("Normal For Loop 1D Array: ");
		for(int i=0;i<5;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		
		//Enhanced For Loop for 1D Array
		System.out.print("Enhanced For Loop 1D Array: ");
		for(int k:nums) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//Assuming we have 4 students
		/*Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		*/
		
		/*Array of objects. 
		Student s[] = new Student[4]
		*/
		
		// we can also write as:(preferred)
		/*Student s[]= {s1,s2,s3,s4};
		s1.rollno=12;
		s1.name="Mike";
		s2.rollno=13;
		s2.name="Ken";
		
		s1.show();
		s2.show();
		for(int j=0;j<4;j++)
		{
			System.out.println(s[j]+" ");
		}
		*/
		
		//2D Array
		/*int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};//semicolon after the brackets
		System.out.println(a[0][0]);
		
		//To print all elements
		for(int i=0;i<3;i++) //specifies the number of rows
		{
			for(int j=0;j<4;j++) //specifies the number of columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		//Jagged Array
		int b[][] = {
				{1,2,3,4},
				{5,6,7},
				{9,10,11,12,13}
		};
		
		//To print all elements
		System.out.println("Normal For Loop 2D Array: ");
		for(int i=0;i<3;i++) //specifies the number of rows
		{
			for(int j=0;j<b[i].length;j++) //specifies the number of columns
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//Enhanced For Loop 2d Array
		System.out.println("Enhanced For Loop 2D Array: ");
		for(int k[]:b) {
			for(int l:k)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	}

}
