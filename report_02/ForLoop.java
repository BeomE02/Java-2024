public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i += 35) { // 'i'를 1로 시작하여 35씩 증가
            sum += i; // 'sum'에 'i'를 더함
        }
        System.out.println(sum); // 결과 출력
    }
}
