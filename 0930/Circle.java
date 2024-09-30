package oop;

public class Circle {
	public int radius;
	public String name;
	
	public Circle() {
		
	}
	public double getArea() {
		return 3.141592*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + area);
		Circle donut = new Circle();
		donut.name = "자바 도넛";
		donut.radius = 5;
		area = donut.getArea();
		System.out.println(pizza.name + "의 면적" + area);
	}
}
