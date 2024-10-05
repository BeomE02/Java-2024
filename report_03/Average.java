public class Average {
    // 최대 10개의 정수를 저장할 배열과 현재 저장된 개수를 나타내는 멤버 변수
    private int[] numbers;
    private int count;

    // 생성자: 배열과 개수 초기화
    public Average() {
        numbers = new int[10];  // 최대 10개의 정수를 저장할 배열
        count = 0;              // 현재 저장된 개수
    }

    // 정수를 저장하는 메소드
    public void put(int num) {
        if (count < 10) {  // 배열에 10개 미만일 때만 저장 가능
            numbers[count] = num;
            count++;
        } else {
            System.out.println("더 이상 저장할 수 없습니다.");
        }
    }

    // 저장된 모든 정수를 출력하는 메소드
    public void showAll() {
        System.out.println("***** 저장된 데이터 모두 출력 *****");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // 줄 바꿈
    }

    // 평균을 계산하여 반환하는 메소드
    public double getAvg() {
        if (count == 0) {  // 저장된 정수가 없을 경우 평균 0 반환
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return (double) sum / count;  // 평균 계산
    }

    // main 메소드: Average 클래스 테스트
    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);   // 10 저장
        avg.put(15);   // 15 저장
        avg.put(100);  // 100 저장
        
        avg.showAll();  // 저장된 모든 원소 출력
        System.out.println("평균은 " + avg.getAvg());  // 평균 출력
    }
}
