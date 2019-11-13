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
public class BillDetail {
  private int bDetailID;
  private int bID;
  private int devicesID;
  private int price;
  private int quantity;
  private int status;

    public BillDetail(int bDetailID, int bID, int devicesID, int price, int quantity, int status) {
        this.bDetailID = bDetailID;
        this.bID = bID;
        this.devicesID = devicesID;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

    public int getbDetailID() {
        return bDetailID;
    }

    public void setbDetailID(int bDetailID) {
        this.bDetailID = bDetailID;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
  
    
  
}
