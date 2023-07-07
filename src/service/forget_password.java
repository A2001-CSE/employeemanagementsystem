/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;

/**
 *
 * @author Anasuya
 */
public class forget_password {
    public static boolean fpassword(String email,String password){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate( "update user_table set password ='"+password+"' where email = '"+email+"'");
            return true;
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
}
