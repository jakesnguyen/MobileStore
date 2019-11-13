/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author jakes
 */
public class UserDAO {

    static String userTable = "(userName, Email, Password, userFullName, Phone, Address, RoleID)";

    public static void insertUser(User u) {

        try {
            Connection con = DBConnect.getConnection();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO UserInfo " + userTable + " VALUES(N'" + u.getUserName() + "',N'" + u.getEmail() + "','" + u.getPassword() + "',N'" + u.getUserFullName() + "','" + u.getPhone() + "',N'" + u.getAddress() + "',2)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.executeUpdate();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public User login(String userName, String password) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + userName + "' and Password = '" + password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User u = new User();
                u.setUserID(rs.getInt("userID"));
                u.setUserName(rs.getString("userName"));
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setAddress(rs.getString("Address"));
                u.setPhone(rs.getString("Phone"));
                u.setRole(rs.getInt("RoleID"));
                con.close();
                return u;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getValueString(String username, String value) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + username + "'";
        PreparedStatement ps;
        String name = null;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name = rs.getString(value);
                con.close();
                return name;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getValueInt(String username, String value) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + username + "'";
        PreparedStatement ps;
        int id;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(value);
                con.close();
                return id;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public String getOldpassword(String userName) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from userInfo where userName = '" + userName + "'";
        PreparedStatement ps;
        String old = "";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                old = rs.getString("Password");
                con.close();
                return old;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return old;
    }
    public void changePassword(String newPassword, String userName) {

        try {
            Connection con = DBConnect.getConnection();

            Statement stmt = con.createStatement();

            String sqlChange = "UPDATE UserInfo SET Password = '" + newPassword + "' WHERE userName = '" + userName + "' ";
            ResultSet rs = stmt.executeQuery(sqlChange);
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
