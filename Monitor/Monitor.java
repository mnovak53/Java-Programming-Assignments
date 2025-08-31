package worksheet1DS;

import java.util.ArrayList;

public class Monitor {
	public static ArrayList<Student> students = new ArrayList<Student>(); 
	public static void main(String args[]) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Course C = new Course();
		students.add(new Student("John", 12, 4.0));
		students.add(new Student("Josh", 44, 3.9));
		students.add(new Student("Luran", 99, 2.9));
		students.add(new Student("Becka", 87, 3.7));
		students.add(new Student("William", 19, 3.3));
		for(int i = 0; i<5; i++) {
			System.out.println("Here is all the students info: ");
			Student student = students.get(i);
			System.out.println("Name: "+student.getName());
			System.out.println("Id"+student.getId());
			System.out.println("GPA"+student.getCgpa());
			System.out.println();
			
		}
		System.out.print("Radious of circle: ");
		c.show();
		System.out.print("Area of the rectangle: ");
		r.show();
		System.out.print("Here is the average GPA: ");
		C.show();
	}
}
