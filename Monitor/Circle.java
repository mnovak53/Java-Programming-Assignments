package worksheet1DS;

public class Circle implements Display{
	static double radius = 3;
	
static double findradius(double r) {
	r = Math.pow(r, 2)*Math.PI;
	return r;
}
public void show() {
	System.out.println(findradius(radius));
}
}
