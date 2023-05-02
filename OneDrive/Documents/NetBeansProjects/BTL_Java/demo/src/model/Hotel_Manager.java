package model;

import view.JF_DangNhap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import view.Home;

public class Hotel_Manager {

    // Cách 1: sử dụng xampp
    public static String sTenDN, sMaNhanVien, sMatKhau, sTenNhanVien, sMaChucVu, sGioiTinh, sNgaySinh, sSDT, sDiaChi, sLuong;
    public static String dbURL;

    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn = null;
        try {
            // Step 1: Load trình điều khiển MySQL JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Xác định URL kết nối
            String dbURL = "jdbc:mysql://localhost:3306/hotel_manager?user=root&password=";

            // Step 3: kết nối tới csdl
            conn = DriverManager.getConnection(dbURL);
            
            System.out.println("Kết nối thành công.");
            JFrame login = new JF_DangNhap();
            login.setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.err.println("Không tải được trình điều khiển JDBC");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.err.println("Không thể kết nối tới database, khiểm tra lại URL.");
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Lối đóng kết nối tới database.");
                ex.printStackTrace();
            }
        }

    }
//    
// Cách 2: sử dụng sql server    
//    public static String dbURL = "jdbc:sqlserver://localhost;databaseName=BTL_HotelManager;user=sa;password=sa; encrypt = false";
//    public static String sTenDN, sMaNhanVien, sMatKhau;
//    public static void main(String[] args) {
//        JFrame login = new JF_DangNhap();
//        login.setVisible(true);
//    }
}
