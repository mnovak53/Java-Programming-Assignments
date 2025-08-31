package burky1;

public class Person {
	private String [] favfood;
	private int age;
	private double selfworth;
	private String name;
	public Person(String[] favfood, int age, double selfworth, String name) {
		this.favfood = favfood;
		this.age = age;
		this.selfworth = selfworth;
		this.name = name;
	}
	public int breath(int n) {
		n += 1;
		return n;
	}
	
	public String toString() {
		String re1 = name;
		Misc.printarr(favfood);
		return re1;
		
	}
}
