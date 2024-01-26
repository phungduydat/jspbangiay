/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Cart {
    private int ida;
    private int idp;
    private int amount;

    public Cart(int ida, int idp, int amount) {
        this.ida = ida;
        this.idp = idp;
        this.amount = amount;
    }

    public Cart() {
    }

    @Override
    public String toString() {
        return "cart{" + "ida=" + ida + ", idp=" + idp + ", amount=" + amount + '}';
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
