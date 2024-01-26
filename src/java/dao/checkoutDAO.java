/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Cartandp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class checkoutDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void addcheckout(int AccountID, String hoten, String gioitinh, String diachi, String dienthoai, String email, String ngaysinh, String cmnd, int thanhtoan) {
        String query = "insert into customer values (?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setInt(1, AccountID);
            ps.setString(2, hoten);
            ps.setString(3, gioitinh);
            ps.setString(4, diachi);
            ps.setString(5,dienthoai);
            ps.setString(6, email);
            ps.setString(7, ngaysinh);
            ps.setString(8, cmnd);
            ps.setInt(9, thanhtoan);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
 
    public static void main(String[] args) {
        checkoutDAO dao = new checkoutDAO();
        String a = "sajdhkjsadh";
        dao.addcheckout(31, a, "bbb", "bbb", "bbb", "bbb", "2000-2-1", "1221212", 2);
    }
}
