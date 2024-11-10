import java.util.Scanner;

public class GradeCalculatorSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("여러 과목의 학점을 빈 칸으로 분리 입력>>");
            String line = scanner.nextLine().trim();

            if (line.equalsIgnoreCase("그만")) {
                break;
            }

            String[] grades = line.split(" ");
            int total = 0;
            int count = 0;

            boolean hasError = false;

            for (String grade : grades) {
                grade = grade.trim().toUpperCase();
                switch (grade) {
                    case "A":
                        total += 100;
                        count++;
                        break;
                    case "B":
                        total += 90;
                        count++;
                        break;
                    case "C":
                        total += 80;
                        count++;
                        break;
                    case "D":
                        total += 70;
                        count++;
                        break;
                    case "F":
                        total += 0;
                        count++;
                        break;
                    default:
                        System.out.println("입력 오류: " + grade);
                        hasError = true;
                        break;
                }
                if (hasError) {
                    break;
                }
            }

            if (!hasError && count > 0) {
                double average = (double) total / count;
                System.out.println("평균은 " + average);
            }
        }
        scanner.close();
    }
}
