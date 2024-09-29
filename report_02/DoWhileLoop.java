public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0, i = 1; // 'i'의 초기값 설정
        do {
            sum += i; // 'sum'에 'i'를 더함
            i += 35; // 'i'에 35 더함
        } while (i <= 50); // 'i'가 50 이하인 경우 반복
        System.out.println(sum); // 결과 출력
    }
}
