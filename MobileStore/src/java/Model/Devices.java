/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jakes
 */
public class Devices {
    private int devicesID;
    private String devicesName;
    private int quantity;
    private int price;
    private int cateID;
    private String img1;
    private String img2;
    private String img3;
    private String description;
    private String specific;
    private String brand;

    public Devices(int devicesID, String devicesName, int quantity, int price, int cateID, String img1, String img2, String img3, String description, String specific, String brand) {
        this.devicesID = devicesID;
        this.devicesName = devicesName;
        this.quantity = quantity;
        this.price = price;
        this.cateID = cateID;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.description = description;
        this.specific = specific;
        this.brand = brand;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public String getDevicesName() {
        return devicesName;
    }

    public void setDevicesName(String devicesName) {
        this.devicesName = devicesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

 
    
}
