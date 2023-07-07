/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Anasuya
 */
import com.mysql.cj.conf.PropertyKey;
import java.sql.*;
public class view_service {
    public static ResultSet getData(){
        try{
            Connection cn = repsistory.ConnectionDB.getConnectiondb();
            Statement st = cn.createStatement();
            ResultSet re = st.executeQuery("select*from user_table");
            return re;
        }catch(SQLException ee){
            ee.printStackTrace();
        }
        return null;
    }
}
