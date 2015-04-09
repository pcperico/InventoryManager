/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Data.Configuration.DatabaseConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author GlobalDev
 */
public class ReportGenerator {
    Connection connection = null;
    Statement statement = null;
    public void Generar()
    {
        try {
            connection = DatabaseConnection.getConnection();
            statement = connection.createStatement();
            HashMap parameterMap = new HashMap();
            parameterMap.put("rtitle", "Report Title Here");//sending the report title as a parameter.
            Report rpt = new Report(parameterMap, connection);
            rpt.setReportName("ProveedoresList"); //productlist is the name of my jasper file.
            rpt.callReport();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
