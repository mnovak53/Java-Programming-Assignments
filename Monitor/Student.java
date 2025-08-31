package worksheet1DS;

public class Student implements Display{
public String name;
public int id;
public static double cgpa;

	public void show() {
	System.out.println(name+"\n"+id+"\n"+cgpa);
	}

	public Student(String na, int i, double cg) {
		this.name = na;
		this.id = i;
		this.cgpa = cg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}