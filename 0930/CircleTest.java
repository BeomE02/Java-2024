package oop;

public class CircleTest {
   public static void main(String[] args) {
      Circle pizza = new Circle();
      pizza.radius = 10;
      pizza.name = "자바피자";
      double pizzaArea = pizza.getArea();
      System.out.println(pizza.name + "의 면적>>" + pizzaArea);
      Circle donut = new Circle();
      donut.radius = 5;
      donut.name = "자바도넛";
      double donutArea = donut.getArea();
      System.out.println(pizza.name + "의 면적>>" + donutArea);
   }
}