/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Connection.ConnectionTruongBaCatTruong;
import Model.bookModel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 05032002
 */
public class bookControl {

    private static Connection conn = null;
    private static String sql;

    public static ArrayList<bookModel> NguonSach(String where, String search) throws IOException {
        ArrayList<bookModel> arrBoPhan = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(ConnectionTruongBaCatTruong.dbURL);
            sql = "Select * From book ";
            if(search != null && !search.equals("") && where != null && !where.equals("")){
                sql = sql + " Where " + where + search;
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bookModel bp = new bookModel();
                bp.setId(rs.getString("Id"));
                bp.setTensach(rs.getString("tensach"));
                bp.setTheloai(rs.getString("theloai"));
                bp.setNamxuatban(rs.getString("namxuatban"));
                bp.setNgaynhap(rs.getString("ngaynhap"));
                bp.setGiatien(rs.getString("giatien"));
                arrBoPhan.add(bp);
            }
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arrBoPhan;
    }
    
    public static void ThemSach(bookModel bp) throws SQLException {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(ConnectionTruongBaCatTruong.dbURL);
            sql = "INSERT INTO book (tensach, theloai, namxuatban, ngaynhap, giatien) VALUES(?, ?, ?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getTensach());
            state.setString(2, bp.getTheloai());
            state.setString(3, bp.getNamxuatban());
            state.setString(4, bp.getNgaynhap());
            state.setString(5, bp.getGiatien());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void CapNhatSach(bookModel bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(ConnectionTruongBaCatTruong.dbURL);
            sql = "UPDATE book SET tensach = ?, theloai = ?, namxuatban = ?, ngaynhap = ?, giatien = ? WHERE id = ?";
            state = conn.prepareStatement(sql);
            state.setString(6, bp.getId());
            state.setString(1, bp.getTensach());
            state.setString(2, bp.getTheloai());
            state.setString(3, bp.getNamxuatban());
            state.setString(4, bp.getNgaynhap());
            state.setString(5, bp.getGiatien());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public static void XoaSach( String Id) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(ConnectionTruongBaCatTruong.dbURL);
            sql = "DELETE FROM book WHERE id = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, Id);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
}
