package Hello.eclipse;

import java.util.Scanner;

class TV{
	String company; // 제품 회사
	int price; // 만들어진 년도
	int size; // 인치
	
	public TV(String company, int price, int size) {
		this.company = company;
		this.price = price;
		this.size = size;
	}
	
	public void show(){
		System.out.println(company+"에서 만든 "+price+"년형 "+size+"인치 TV");
	}
}

public class Practice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		TV myTV = new TV("Samsung", 300, 50); // LG에서 만든 2017년 32인치
		myTV.show();
	}
}
