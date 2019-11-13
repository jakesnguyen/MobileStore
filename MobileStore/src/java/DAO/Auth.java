/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;

/**
 *
 * @author jakes
 */
public class Auth {
        public static boolean authenticate(String username, String password) {

        UserDAO cd = new UserDAO();
        User u;
        u = cd.login(username, password);

            try {
                if (u.getUserName() != null && u.getPassword()!=null) {
                    return true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        return false;
    }
    public static void main(String[] args) {
        int sotrang = 28%9;
        if(sotrang == 0){
           System.out.print(sotrang); 
        }
        if(sotrang != 0)
          sotrang = 28/9;
            System.out.print(sotrang+1); 
        }
    }

