/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Devices;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakes
 */
public class DevicesDAO {

    public ArrayList<Devices> getAllDevices() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Devices";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            ArrayList<Devices> dList = new ArrayList<Devices>();

            while (rs.next()) {
                //int string int int int string string string string string string

                dList.add(new Devices(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }

            stmt.close();
            con.close();
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public ArrayList<Devices> getAllMobile() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Devices WHERE cateID = '1'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            ArrayList<Devices> dList = new ArrayList<Devices>();

            while (rs.next()) {
                //int string int int int string string string string string string

                dList.add(new Devices(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }

            stmt.close();
            con.close();
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
        public ArrayList<Devices> getAllTablet() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Devices WHERE cateID = '2'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            ArrayList<Devices> dList = new ArrayList<Devices>();

            while (rs.next()) {
                //int string int int int string string string string string string

                dList.add(new Devices(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }

            stmt.close();
            con.close();
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
        
            public ArrayList<Devices> getAllAccessories() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Devices WHERE cateID = '3'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            ArrayList<Devices> dList = new ArrayList<Devices>();

            while (rs.next()) {
                //int string int int int string string string string string string

                dList.add(new Devices(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }

            stmt.close();
            con.close();
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
