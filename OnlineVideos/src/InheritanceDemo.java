
class Animal
{
	public void sound() {
		System.out.println("Animals make sounds.");
	}
}

class Dog extends Animal //single level inheritance. This is a IS-A class
{
	public void bark() {
		System.out.println("Dogs bark.");
	}
}

class Puppy extends Dog //multilevel inheritance. This is a IS-A class 
{
	public void whine() {
		System.out.println("A puppy whines.");
	}
}
public class InheritanceDemo // This is a HAS-A class
{

	public static void main(String[] args) {
		
		//single level inheritance
		System.out.println("In single level inheritance");
		Dog d = new Dog();
		d.sound();
		d.bark();
		System.out.println();
		
		//multilevel inheritance
		Puppy p = new Puppy();
		System.out.println("In multilevel inheritance");
		p.sound();
		p.bark();
		p.whine();

	}

}
