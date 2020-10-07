/*
 * InforDAO.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package dao;

import context.DBContext;
import entity.Information;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * InforDAO <br>
 * 
 * <pre>
 * Store InforDAO
 * .getInfomation()
 * </pre>
 * 
 * @author thinh
 */


public class InforDAO {
    // get all information of shushi restaurant
    public Information getInformation() throws SQLException, Exception {
        //create connection
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            //get all records of Information table query
            String query = " select * from information; ";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               //get all attributes of Information
               Information infor = new Information(rs.getInt("id"), 
                       rs.getString("address"), 
                       rs.getString("tel"), 
                       rs.getString("email"), 
                       rs.getString("openingHours") );
                return infor;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            db.closeConnection(rs, ps, conn);
        }
        return null;
    }
}
