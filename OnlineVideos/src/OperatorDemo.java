
public class OperatorDemo {
	/*
	 *Arithmetic 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// Arithmetic
		int a=6, b=4;
		int r1 = a+b;
		int r2 = a-b;
		int r3 = a*b;
		double r4 = (double)a/b;
		int r5 = a%b;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		//Bitwise
		int c= 4, d= 5;
		d+= c; //y=y+x
		System.out.println(d);
		//pre-increment
		int e= 4, f =5;
		++e;// increments the value of e then assigns it.
		int g=e;
		System.out.println(g);
		
		//post-increment
		int h;
		f++;
		h = f;
		System.out.println(h);
		//notice this diffrence
		int i= 7,j;
		j=i++;// the value of i has first been assigned to j then it has been incremented.
		System.out.println(j);
		System.out.println(i);
		
		
	}

}
