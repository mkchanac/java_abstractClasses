package AbstractClasses;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is pecking");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("Breathe in, breathe out, repeat");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is flapping its wings");
	}

	
	
}
