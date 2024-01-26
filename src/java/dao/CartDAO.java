/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Cartandp;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duyda
 */
public class CartDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void addcart(int ida, String idp) {
        int i = Integer.parseInt(idp);
        String query = "insert into Cart values (?,?,1)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setInt(1, ida);
            ps.setInt(2, i);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public List<Cartandp> Showlistbuy(int ida) {
        List<Cartandp> list = new ArrayList<>();
        String query = "select  *\n"
                + "from product  INNER JOIN Cart \n"
                + "on product.id = cart.ProductID "
                + "where AccountID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, ida);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cartandp(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(9),
                        rs.getInt(11),
                        rs.getInt(12)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deletecart(String cartid) {
        String query = "delete from Cart \n"
                + "where idcart = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //chuyen cid vao dau ? thu 1
            ps.setString(1, cartid);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        CartDAO dao = new CartDAO();
        List<Cartandp> list = dao.Showlistbuy(31);
        for (Cartandp o : list) {
            System.out.println(o);
        }
    }
}
