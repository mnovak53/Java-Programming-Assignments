package worksheet1DS;

public class Course implements Display{

	
	public double avgCgpa() {
		double Cgpa = 0;
		double print= 0;
		for(int i =0; i<4;i++) {
			Cgpa += Student.getCgpa();
			print = Cgpa/5;
		}
		return print;
	}
	public void show(){
		System.out.println(avgCgpa());
	}
	
}
