package java_2024;

public class VArrayEX {
    public static void main(String[] args) {
        VArray v = new VArray(5);
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());

        for (int i = 0; i < 7; i++) {
            v.add(i); // 배열에 0부터 6까지 순서대로 저장
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll(); // 0123456

        v.insert(3, 100); // 인덱스 3에 100 삽입
        v.insert(5, 200); // 인덱스 5에 200 삽입
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll(); // 0 1 2 100 3 200 4 5 6
        
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll(); // 0 1 2 100 3 4 5 6

        for (int i = 50; i < 55; i++) {
            v.add(i); // 배열에 50부터 54까지 순서대로 저장
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        v.printAll(); // 0 1 2 100 3 4 5 6 50 51 52 53 54
    }
}
