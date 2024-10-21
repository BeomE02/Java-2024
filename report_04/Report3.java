package java2024;

class ColorPoint extends Point{
	String color;
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";  
	}
}

public class Report3 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "red");
		cp.setXY(20, 20);
		cp.setColor("blue");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
