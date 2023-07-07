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
public class login_service {
     public static boolean loginService(String name, String password){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select*from user_table where name ='"+name+"'and password ='"+password+"'");
            while(rs.next()){
            return true;
         }
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
    
}
