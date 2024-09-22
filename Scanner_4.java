package java_2024;

import java.util.Scanner;

public class Scanner_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 세개를 입력하시오 >> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int middle = 0;
		
		if(num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("중복 되는 데이터가 있어 중간 값을 찾을 수 없습니다.");
		}
		else {
			if((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2)) {
				middle = num1;
			}
			else if((num2 < num1 && num2 > num3) || (num2 < num3 && num2 > num1)){
				middle = num2;
			}
			else {
				middle = num3;
			}
			System.out.println("정수 세개중 중간 크기의 값을 가진 정수는 " + middle);
		}
	}
}
