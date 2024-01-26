/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Customer {

    private int AccountID;
    private String hoten;
    private String gioitinh;
    private String diachi;
    private String dienthoai;
    private String email;
    private String ngaysinh;
    private String cmnd;
    private int thanhtoan;

    public Customer() {
    }

    public Customer(int AccountID, String hoten, String gioitinh, String diachi, String dienthoai, String email, String ngaysinh, String cmnd, int thanhtoan) {
        this.AccountID = AccountID;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
        this.thanhtoan = thanhtoan;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(int thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    @Override
    public String toString() {
        return "Customer{" + "AccountID=" + AccountID + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", dienthoai=" + dienthoai + ", email=" + email + ", ngaysinh=" + ngaysinh + ", cmnd=" + cmnd + ", thanhtoan=" + thanhtoan + '}';
    }
    
}
