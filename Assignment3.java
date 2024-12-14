public class Assignment3 {

	public static void main(String[] args) {
		
		
		Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: " + rectangle.area());
       
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

	}

}
abstract class Shape{
	abstract double area();
}
class Rectangle extends Shape{
	private double lenght;
	private double width;
	Rectangle(double lenght,double width){
		this.lenght=lenght;
		this.width=width;
	}
	@Override
	double area() {
		return lenght * width;
	}
}
class Circle extends Shape{
	private double radius;
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	double area() {
		return Math.PI*radius*radius;
	}
}