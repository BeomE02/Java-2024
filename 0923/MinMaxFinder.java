//5개의 정수를 입력 받아 배열에 저장하고 최대값과 최소값을 출력하는 알고리즘
package control;

import java.util.Scanner;

public class Statment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] intArray = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(i+"번째 정수 입력 ");
			intArray[i] = scanner.nextInt();
			if(max < intArray[i])
				max = intArray[i];
			if(min > intArray[i])
				min = intArray[i];
			sum += intArray[i];
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println();
			System.out.println(intArray[i]+ " " );
		}
		System.out.println();
		System.out.println("최대값 = " + max + ", 최소값 = " + min + ", 합 = " + sum + ",\ 평균 = " + (double)sum/5);
		scanner.close();
	}
}
