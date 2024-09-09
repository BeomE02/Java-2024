
//사용자에게 원의 반지름을 입력받아 원의 면적을 출력하는 프로그램

package Hello.eclipse;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		
		final double PI = 3.141592;
		double circleArea;
		double rad;
		
		System.out.print("반지름을 입력하세요: ");
		
		rad = radius.nextDouble();
		circleArea = PI * rad * rad;
		
		System.out.println("원의 면적은: " + circleArea + "입니다.");
		radius.close();
	}
}

