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
public class User {
    private int userID;
    private String userName;
    private String Email;
    private String Password;
    private String userFullName;
    private String Address;
    private String Phone;
    private int Role;

    public User(){
        
    }
    public User(String userName, String Email, String Password, String userFullName, String Address, String Phone) {
     
        this.userName = userName;
        this.Email = Email;
        this.Password = Password;
        this.userFullName = userFullName;
        this.Address = Address;
        this.Phone = Phone;

    }
    
    public User(int userID, String userName, String Email, String Password, String userFullName, String Address, String Phone, int Role) {
        this.userID = userID;
        this.userName = userName;
        this.Email = Email;
        this.Password = Password;
        this.userFullName = userFullName;
        this.Address = Address;
        this.Phone = Phone;
        this.Role = Role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }
    
    
}
