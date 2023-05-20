package Connection;

import View.DangNhap;
import javax.swing.JFrame;

public class ConnectionTruongBaCatTruong {

    public static String dbURL = "jdbc:sqlserver://localhost;"
            + "databaseName=dbTruongBaCatTruong71DCTT21;"
            + "user=sa;"
            + "password=sa; "
            + "encrypt = false";
    public static void main(String[] args) {
        JFrame login = new DangNhap();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
