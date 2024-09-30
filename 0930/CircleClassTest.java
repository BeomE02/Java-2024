package oop;
class CircleClass {
   public String name;
   public int radius;
   public CircleClass() {
      
   }
   public double getArea() {
      return 3.141592 * radius * radius;
   }
}
public class CircleClassTest {
   public static void main(String[] args) {
      CircleClass pizza = new CircleClass();
      pizza.radius = 10;
      pizza.name = "자바피자";
      double pizzaArea = pizza.getArea();
      System.out.println(pizza.name + "의 면적>>" + pizzaArea);
      CircleClass donut = new CircleClass();
      donut.radius = 5;
      donut.name = "자바도넛";
      double donutArea = donut.getArea();
      System.out.println(pizza.name + "의 면적>>" + donutArea);
   }
}
