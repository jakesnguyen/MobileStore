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
public class Item {
 
    private Devices devices;
    private int quantity;
 
    public Item() {
    }
 
    public Item(Devices devices, int quantity) {
        this.devices = devices;
        this.quantity = quantity;
    }
 
    public Devices getDevices() {
        return devices;
    }
 
    public void setFlower(Devices devices) {
        this.devices = devices;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
}
