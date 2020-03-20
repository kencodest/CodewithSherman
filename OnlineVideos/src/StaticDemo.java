
class Employee{
	int eid;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Employee ken = new Employee();
		Employee muia = new Employee();
		
		ken.eid=1;
		ken.salary=100_000;
		ken.ceo="Mwangangi";
		
		muia.eid=2;
		muia.salary=200_000;
		muia.ceo="Mwangangi";
		muia.ceo="Osapir";// we expect that since both employees work under the same CEO, when the CEO changes, he should change for all employees.
		ken.show();
		muia.show();
				

	}

}
 