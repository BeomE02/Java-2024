public class WhileLoop {
    public static void main(String[] args) {
        int sum = 0, i = 1; // 'i'의 초기값 설정
        while (true) {
            if (i > 50) // 'i'가 50보다 크면 반복문 종료
                break;
            sum = sum + i; // 'sum'에 'i'를 더함
            i += 35; // 'i'에 35 더함
        }
        System.out.println(sum); // 결과 출력
    }
}
