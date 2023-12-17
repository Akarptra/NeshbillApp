/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class koneksi {
        Connection conn = null;

    public static Connection koneksiDB(){ 

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neshbill", "root", "");

            return conn;

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, "Tidak Terkoneksi");
            System.exit(0);
            return null;

        }

    }
}
