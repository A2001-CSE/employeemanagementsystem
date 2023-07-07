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
public class delete_Service {
    public static boolean deletePage(String name){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
             st.executeUpdate( "delete from user_table  where name ='"+name+"'");
         return true;
        }catch(SQLException ee){
            ee.printStackTrace();
        }return false;
    }
}
