/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Anasuya
 */
import java.sql.*;
public class Update_service {
     public static boolean Update_email(String name,String email){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate( "update user_table set email = '"+email+"' where name ='"+name+"'");
            return true;
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
     public static boolean Update_password(String name,String password){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate( "update user_table set password = '"+password+"'where name ='"+name+"'");
            return true;
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
     public static boolean Update_address(String name,String address){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            st.executeUpdate( "update user_table set address = '"+address+"'where name ='"+name+"'");
            return true;
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
     
}
