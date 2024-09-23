package control;

import java.util.Scanner;

public class Statment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		int score;
		System.out.print
		("점수 입력 : ");
		
		score = scanner.nextInt();
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
		}
		
		System.out.println("당신의 점수는 "+ score + "이며 등급은 " +grade+ " 입니다.");
		scanner.close();
		}
}

