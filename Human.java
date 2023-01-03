
public abstract class Human {
	//Number2. We can't create instances for abstract class.
	
	public abstract void makesChange();
	public abstract void improveSelf();
//Number1. Interface may inherit multiple interface and contains abstract methods.
public interface LivingThings{
	public void moves();
	public void grows();
	
}
public interface Birds{
	public void eats();
	public void speaks();
}
//Number5. interface does not contain any constructors.
public interface Cow extends Birds {
	Cow(String type, int noOfSpecies, String Species){
		this.type = type;
		this.noOfSpecies = noOfSpecies;
		this.Species = Species;
	}
	//The above block of code is not correct, and as a result the compiler throws an error.
	
}
public interface Bird extends LivingThings{
	
}

public class Dog implements LivingThings{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grows() {
		// TODO Auto-generated method stub
		
	}
	
}
//Number3. A class may extend only one class but may implement multiple interfaces.
public class Dog extends Human{
	
}
//Number4. If a class inherits abstract class, we have to inherit all abstract methods.
public class Male extends Human{

	@Override
	public void makesChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void improveSelf() {
		// TODO Auto-generated method stub
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
