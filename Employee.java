import java.util.Scanner;
public class Employee {
	
	String name, id;
	double salary;
	
	
	Employee(String name, String id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	Employee(){
		this.name = "Null";
		this.id = "Null";
		this.salary = 0.0;
	}
	Employee(String mName, double salay){
		this.name = mName;
		this.id  = "Null";
		this.salary = salay;
		
	}
	static void display(String...str) {
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
	int sumOfIntegers(int...num) {
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		
		Employee E2 = new Employee("Sumeya", "0034", 5600.50);
		System.out.println(E1.name + " "+ E1.id+" " + E1.salary);
		System.out.println(E2.name + " "+ E2.id+ " "+ E2.salary);
		Employee E3 = new Employee("Abdurahman", 6700.00);
		System.out.println(E3.name);
		System.out.println(E3.id);
		System.out.println(E3.salary);
		
		int R1 = E3.sumOfIntegers(10, 67, 78, 98);
		System.out.println(R1);
		int R2 = E3.sumOfIntegers(23, 89, 23);
		System.out.println(R2);
		int R3 = E3.sumOfIntegers(23,45);
		System.out.println(R3);
		
		display("Sophia","Zekeriya");
		System.out.println();
		display("Engineering", "Software", "Student");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String myName = scan.nextLine();
		System.out.println("Enter your age: ");
		int myAge = scan.nextInt();
		System.out.println("Enter the amount of your salary: ");
		double mySalary = scan.nextDouble();
		System.out.println("Hi there " + myName + ", you are " + myAge +" years old, " + "your salary is " + mySalary + ".");
		
		//Done by: Sofia Alemu--RU3049/13
		//         Sumeya Abesha--RU 0020/13
		
	}

}
