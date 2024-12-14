package Report;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

public class OracleBookManagementSystem {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField titleField, authorField, yearField, categoryField, searchField;
    private Connection connection;

    // Oracle DB 연결 초기화
    public OracleBookManagementSystem() {
        try {
            // DB 연결 정보
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Oracle XE 기본 URL
            String user = "system"; // Oracle 사용자명
            String password = "sys"; // Oracle 비밀번호
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB 연결 실패");
        }
        initialize();
        loadTableData();
    }

    // GUI 초기화
    private void initialize() {
        frame = new JFrame("도서 관리 시스템");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // 상단 패널 - 입력 필드 및 버튼
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 5));

        titleField = new JTextField();
        authorField = new JTextField();
        yearField = new JTextField();
        categoryField = new JTextField();
        JButton addButton = new JButton("추가");
        JButton updateButton = new JButton("수정");

        inputPanel.add(new JLabel("제목"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("저자"));
        inputPanel.add(authorField);
        inputPanel.add(addButton);

        inputPanel.add(new JLabel("출판년도"));
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("카테고리"));
        inputPanel.add(categoryField);
        inputPanel.add(updateButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // 중앙 패널 - JTable
        tableModel = new DefaultTableModel(new String[]{"ID", "제목", "저자", "출판년도", "카테고리"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 하단 패널 - 검색 및 삭제 버튼
        JPanel searchPanel = new JPanel();
        searchField = new JTextField(20);
        JButton searchButton = new JButton("검색");
        JButton deleteButton = new JButton("삭제");

        searchPanel.add(new JLabel("검색:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(deleteButton);
        frame.add(searchPanel, BorderLayout.SOUTH);

        // 버튼 이벤트 추가
        addButton.addActionListener(e -> addBook());
        updateButton.addActionListener(e -> updateBook());
        searchButton.addActionListener(e -> searchBooks());
        deleteButton.addActionListener(e -> deleteBook());

        frame.setVisible(true);
    }

    // DB에서 데이터 가져오기
    private void loadTableData() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books ORDER BY id");

            tableModel.setRowCount(0); // 기존 데이터 초기화
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("title"));
                row.add(rs.getString("author"));
                row.add(rs.getInt("year"));
                row.add(rs.getString("category"));
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 도서 추가
    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String year = yearField.getText();
        String category = categoryField.getText();

        try {
            PreparedStatement pstmt = connection.prepareStatement(
                "INSERT INTO books (title, author, year, category) VALUES (?, ?, ?, ?)"
            );
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setInt(3, Integer.parseInt(year));
            pstmt.setString(4, category);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(frame, "도서가 추가되었습니다.");
            loadTableData(); // 테이블 새로고침
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "도서 추가 중 오류가 발생했습니다.");
        }
    }

    // 도서 수정
    private void updateBook() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "수정할 도서를 선택하세요.");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);
        String title = titleField.getText();
        String author = authorField.getText();
        String year = yearField.getText();
        String category = categoryField.getText();

        try {
            PreparedStatement pstmt = connection.prepareStatement(
                "UPDATE books SET title = ?, author = ?, year = ?, category = ? WHERE id = ?"
            );
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setInt(3, Integer.parseInt(year));
            pstmt.setString(4, category);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(frame, "도서가 수정되었습니다.");
            loadTableData(); // 테이블 새로고침
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "도서 수정 중 오류가 발생했습니다.");
        }
    }

    // 도서 삭제
    private void deleteBook() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "삭제할 도서를 선택하세요.");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);

        try {
            PreparedStatement pstmt = connection.prepareStatement(
                "DELETE FROM books WHERE id = ?"
            );
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(frame, "도서가 삭제되었습니다.");
            loadTableData(); // 테이블 새로고침
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "도서 삭제 중 오류가 발생했습니다.");
        }
    }

    // 도서 검색
    private void searchBooks() {
        String keyword = searchField.getText();

        try {
            PreparedStatement pstmt = connection.prepareStatement(
                "SELECT * FROM books WHERE title LIKE ? OR author LIKE ?"
            );
            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");
            ResultSet rs = pstmt.executeQuery();

            tableModel.setRowCount(0); // 기존 데이터 초기화
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("title"));
                row.add(rs.getString("author"));
                row.add(rs.getInt("year"));
                row.add(rs.getString("category"));
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        SwingUtilities.invokeLater(OracleBookManagementSystem::new);
    }
}
