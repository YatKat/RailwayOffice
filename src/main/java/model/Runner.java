package model;

import model.DAO.TrainsDAO;
import model.DBConnection.ConnectionPool;
import model.entity.Trains;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionPool.getConn();
            System.out.println("Get connection");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT nameStation FROM stations");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " ");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
        List<String> list = new ArrayList<String>();
        list.add("Київ");
        list.add("Ужгород");
        list.add("26.05.2018");
        List<Trains> trains = TrainsDAO.findTrainByClientApp(list);

        for (String s :list) {
            System.out.println(s);
        }
    }

}
