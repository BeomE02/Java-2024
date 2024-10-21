package java2024;

class ColorTv extends TV {
	int color;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty(){
		System.out.println(getSize() + "인치" + color + "컬러");
	}
}

public class Report1 {
	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(70, 65536);
		myTv.printProperty();
	}
}
