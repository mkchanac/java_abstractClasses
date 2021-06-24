package AbstractClasses;
//you can;t directly instantiate a class that is abstract 
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Parrot");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguine penguine = new Penguine("Emperor");
		penguine.fly();
		
		
		
	}

}
