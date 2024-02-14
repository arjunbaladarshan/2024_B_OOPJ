public class Shape{
	public void area(int radius){
		double ans = Math.PI * Math.pow(radius,2);
		System.out.println("Area of a circle = "+ans);
	}

	public void area(double width){
		double ans = width * width;
		System.out.println("Area of a Square = "+ans);
	}

	public void area(int height, int width){
		double ans = height * width;
		System.out.println("Area of a rectangle = "+ans);
	}
}