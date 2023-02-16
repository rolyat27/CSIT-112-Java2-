public class Triangle {
	public double base;
	public double height;
	public double area;

	public void setBase(double userBase) {
		base = userBase;
	} 
	public void setHeight(double userHeight) {
		height = userHeight;
	}
	public double getArea() {
		area = 0.5 * base * height;
		return area;
	}
	public void printInfo() {
		System.out.println("Base: " +  base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
	}
}

