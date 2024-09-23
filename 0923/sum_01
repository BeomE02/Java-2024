//7의 배수를 제외하고 1부터 모든 값을 더하는 알고리즘
package control;

import java.util.Scanner;

public class Statment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 몇까지 더할지 입력하시오 : ");		
		
		int sum = 0; 
		int number = scanner.nextInt();
		int i = 1;
		
//--------------------------------------------
		//do while 사용
		
		do {
			if(i%7 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}while(i <= number);

//--------------------------------------------	
		//for 사용
		
//		for(i=0; i <= number; i++) { 
//			if(i%7 == 0)
//				continue;
//			sum += i;
//		}
//--------------------------------------------
		// while 사용
		
//		while(i <= number) {
//			if(i%7 == 0) {
//				i++;
//				continue;
//			}
//			sum += i;
//			i++;
//		}
//--------------------------------------------
		
		System.out.println(sum);
		scanner.close();
		}
}
