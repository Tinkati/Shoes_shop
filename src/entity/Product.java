/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String shoeType;
    private String manufacture; 
    private int price;
    private int quantity;
    
    public Product(){   
    }
    public String getShoeType(){
        return shoeType;   
    }
    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }
    public String getManufacture() {
        return manufacture;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" 
                + "shoeType=" + shoeType 
                + ",\n manufacture=" + manufacture
                + ",\n price=" + price 
                + ",\n quantity=" + quantity 
                + "\n}";
    }

    public void setName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
