package burky1;

public class Main {
	public static void main(String args[]) {
		String[] food = {"pizza", "sushi", "bread"};
		Person per1 = new Person(food, 20, 0.5, "fred");
		Doctor doc1 = new Doctor(food, 12, 2.0, "bob");
		System.out.println(per1);
	}
	
	
		
	
}
