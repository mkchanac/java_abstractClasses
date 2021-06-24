package AbstractClasses;

public class Penguine extends Bird{

	public Penguine(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am not very good at that, can I go for a swim instead?");
	}

}
