package java_2024;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int price[] = {3000, 3500, 4000, 5000};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");
        
        while (true) {
            System.out.print("주문>> ");
            String order = scanner.nextLine();

            if (order.equals("그만")) {
                break; // '그만' 입력 시 종료
            }
            
            // 주문을 공백으로 나누기
            String[] parts = order.split(" ");
            if (parts.length != 2) {
                System.out.println("잘못된 주문 형식입니다. 다시 입력해주세요.");
                continue;
            }
            
            String coffeeName = parts[0];
            String quantityStr = parts[1];
            int quantity;

            // 수량 입력값이 양의 정수인지 확인
            try {
                if (quantityStr.endsWith("잔")) {
                    quantityStr = quantityStr.substring(0, quantityStr.length() - 1); // "잔" 제거
                }
                quantity = Integer.parseInt(quantityStr);
                if (quantity <= 0) {
                    System.out.println("잔 수는 양의 정수로 입력해주세요!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");
                continue;
            }

            // 주문한 커피의 가격 찾기
            int coffeeIndex = -1;
            for (int i = 0; i < coffee.length; i++) {
                if (coffee[i].equals(coffeeName)) {
                    coffeeIndex = i;
                    break;
                }
            }
            
            if (coffeeIndex != -1) {
                int totalPrice = price[coffeeIndex] * quantity; // 총 가격 계산
                System.out.println("가격은 " + totalPrice + "원입니다.");
            } else {
                System.out.println(coffeeName + "은 없는 메뉴입니다.");
            }
        }
        
        scanner.close(); // 스캐너 닫기
    }
}
