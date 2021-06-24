package AbstractClasses;
//interface is entirely abstract, no any actual action.
//abstract does some actual action.
//method abstract in the parent abstract class animal
//so the dog class need to do the actual method
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
	}
	
}
