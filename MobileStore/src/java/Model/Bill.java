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
public class Bill {
    private int bID;
    private int userID;
    private int Total;
    private String payment;
    private String Bank;
    private String Address;
    private String date;

    public Bill(){
        
    }
    public Bill(int bID, int userID, int Total, String payment, String Bank, String Address, String date) {
        this.bID = bID;
        this.userID = userID;
        this.Total = Total;
        this.payment = payment;
        this.Bank = Bank;
        this.Address = Address;
        this.date = date;
    }
    public Bill( int userID, int Total, String payment, String Bank, String Address, String date) {
        
        this.userID = userID;
        this.Total = Total;
        this.payment = payment;
        this.Bank = Bank;
        this.Address = Address;
        this.date = date;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
