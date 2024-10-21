package java2024;

class ColorPoint2 extends Point{
	String color;
	ColorPoint2(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	ColorPoint2(int x, int y){
		super(x, y);
	}
	ColorPoint2(){
		super(0, 0);
		this.color = "white";
	}
	
	void set(String color) {
		this.color = color;
	}
	
	void set(int x, int y) {
		move(x, y);
	}
	
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	
	int getDistance(ColorPoint2 cp) {
		return 1;
	}
}

public class Report4 {
	public static void main(String[] args) {
		ColorPoint2 zeropoint = new ColorPoint2();
		System.out.println(zeropoint.toString() +"입니다.");
		ColorPoint2 cp = new ColorPoint2(10, 10, "RED");
		
		cp.set ("BLUE");
		cp.set (10, 20);
		System.out.println(cp.toString() + "입니다.");
		ColorPoint2 thresholdPoint = new ColorPoint2(100, 100);
		System.out.println("cp에서 임계점까지의 거리는"+ cp.getDistance(thresholdPoint)) ;

	}

}
