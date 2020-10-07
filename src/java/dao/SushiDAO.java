/*
 * SushiDAO.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package dao;

import context.DBContext;
import entity.Sushi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * SushiDAO <br>
 * 
 * <pre>
 * Store SushiDAO
 * getOne()
 * getTotalSushi()
 * getListSuShiPaging()
 * </pre>
 * 
 * @author thinh
 */

public class SushiDAO {
    
    // get all information of 1 shushi by id
    public Sushi getOne(int id) throws SQLException, Exception {
        //create connection
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            //get all attributes of 1 Shushi by id query
            String query = " SELECT * FROM Sushi WHERE Id = ? ";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            //get all attributes of 1 Shushi
            while (rs.next()) {
                Sushi sushi = new Sushi(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getString("shortDes"),
                        rs.getString("detailDes"),
                        rs.getString("price"));
                return sushi;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            db.closeConnection(rs, ps, conn);
        }
        return null;
    }
    
    //count all shushi by id
    public int getTotalSushi() throws SQLException, Exception {
        //create connection
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        int count = 0;
        try {
            //count id from Shushi query
            String query = " SELECT COUNT(Id) as Count FROM Sushi ";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("Count");
            }
            return count;
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            db.closeConnection(rs, ps, conn);
        }
    }
    
    //paging shushi at Homepage
    public List<Sushi> getListSuShiPaging(int pageIndex, int pageSize) throws SQLException, Exception {
        //create connection
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        List<Sushi> list = new ArrayList<>();
        try {
            //get list Shushies in a range query
            String query = " select *from( "
                    + " select ROW_NUMBER() over (order by ID ASC) as rn, *\n "
                    + " from Sushi \n "
                    + " )as x\n "
                    + " where rn between (?-1)*?+1 "
                    + " and ?*? ";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                //get all attributes of 1 Shushi
                Sushi sushi = new Sushi(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("image"),
                        rs.getString("shortDes"),
                        rs.getString("detailDes"),
                        rs.getString("price"));
                list.add(sushi);
            }
            return list;
        } catch (Exception e) {
            throw e;
        } finally {
            //close connection
            db.closeConnection(rs, ps, conn);
        }
    }
}
