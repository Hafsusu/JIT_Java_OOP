
public class Chef {
	String name;
	int noOfMeals;
	public void makeSalad() {
		System.out.println("The chef makes salad.");
		
	}
	 public void makeChicken() {
		 System.out.println("The chef makes delicious chiccken");
	 }
	 public void makeSpecialMeal() {
		 System.out.println("The chef makes barbeque.");
	 }
	
public class ItalianChef extends Chef{
	public void makePasta() {
		System.out.println("The Italian chef makes pasta.");
	}
	public void makeSpecialMeal() {
		System.out.println("The Italian chef makes club sandwitch.");
	}
}

public interface TurkishChef{
	public void makeAMeal();
	public void makeCake();
}

public class NormalChef implements TurkishChef{

	@Override
	public void makeAMeal() {
		// TODO Auto-generated method stub
		System.out.println("The chef makes a meal.");
		
	}

	@Override
	public void makeCake() {
		// TODO Auto-generated method stub
		System.out.println("The chaf makes cakes.");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef ch1 = new Chef();
		ch1.makeSalad();
		ch1.makeSpecialMeal();
	    ItalianChef ch2 = new ItalianChef();
		ch2.makeChicken();
		ch2.makeSpecialMeal();
		NormalChef ch3 = new NormalChef();
		ch3.makeAMeal();
		ch3.makeCake();

	}

}

