package java_2024;

import java.util.Objects;

class Book {
    private String author;  // 저자
    private String title;   // 도서명
    private String buyer;   // 구입자

    // 생성자
    public Book(String author, String title, String buyer) {
        this.author = author;
        this.title = title;
        this.buyer = buyer;
    }

    // equals() 메서드: 저자와 도서명만 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    // toString() 메서드: 출력 형식 지정
    @Override
    public String toString() {
        return buyer + "이(가) 구입한 도서: " + author + "의 " + title;
    }
}

public class BookApp {
    public static void main(String[] args) {
        Book a = new Book("황기태", "명품자바", "김하진");
        Book b = new Book("황기태", "명품자바", "하여린");

        // toString() 메서드 출력
        System.out.println(a);
        System.out.println(b);

        // equals() 메서드 비교
        if (a.equals(b)) {
            System.out.println("같은 책");
        } else {
            System.out.println("다른 책");
        }
    }
}
