package worksheet1DS;

public class Rectangle implements Display{
static double length = 9;
static double width = 7;
	public double area(double len, double wid) {
		double area = wid * len;
		return area;
		}
	public void show() {
		System.out.println(area(length, width));
	}
}
