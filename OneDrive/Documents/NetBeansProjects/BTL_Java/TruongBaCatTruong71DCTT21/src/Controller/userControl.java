package Controller;

import Connection.ConnectionTruongBaCatTruong;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class userControl {

    public static boolean DangNhap(String taikhoan, String matkhau) {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            conn = DriverManager.getConnection(ConnectionTruongBaCatTruong.dbURL);

            String sql = "SELECT * FROM users where taikhoan = ? AND matkhau = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, taikhoan);
            statement.setString(2, matkhau);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false; 
    }
}
