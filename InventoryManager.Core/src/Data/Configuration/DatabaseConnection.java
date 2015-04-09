/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GlobalDev
 */
public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Class.forName(StringsKeysHelper.GetConfigKeysApp().getProperty("jdbcDriver"));
            Connection con = DriverManager.getConnection(StringsKeysHelper.GetConfigKeysApp().getProperty("jdbcConnectionString"));
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
