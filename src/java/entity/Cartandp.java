/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author duyda
 */
public class Cartandp {
    private int idp;
    private String name;
    private String image;
    private double price;
    private String title;
    private String description;
    private int ida;
    private int amount;
    private int idcart;

    public Cartandp(int idp, String name, String image, double price, String title, String description, int ida, int amount, int idcart) {
        this.ida = ida;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.idp = idp;
        this.amount = amount;
        this.idcart = idcart;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getIdcart() {
        return idcart;
    }

    public void setIdcart(int idcart) {
        this.idcart = idcart;
    }

    @Override
    public String toString() {
        return "Cartandp{" + "ida=" + ida + ", name=" + name + ", image=" + image + ", price=" + price + ", title=" + title + ", description=" + description + ", idp=" + idp + ", amount=" + amount + ", idcart=" + idcart + '}';
    }

    
}
