package model.DAO;

import model.DBConnection.ConnectionPool;
import model.entity.Routes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoutesDAO {

    public static Routes findRoute(List<String> clientApply){
        Connection conn;
        PreparedStatement prepStat = null;
        ResultSet resultSet = null;
       Routes route = new Routes();
       String prepStatement = "SELECT * FROM routes WHERE startStation = ? AND endStation = ?;";
        try{
            conn = ConnectionPool.getConn();
            prepStat = conn.prepareStatement(prepStatement);
            prepStat.setString(1, clientApply.get(0));
            prepStat.setString(2, clientApply.get(1));
            resultSet = prepStat.executeQuery();
            while(resultSet.next()){
                route.setId(resultSet.getInt(1));
                route.setStartStation(resultSet.getString(2));
                route.setStation1(resultSet.getString(3));
                route.setStation2(resultSet.getString(4));
                route.setStation3(resultSet.getString(5));
                route.setEndStation(resultSet.getString(6));
                route.setTotalDistance(resultSet.getInt(7));
                route.setDistance1_2(resultSet.getInt(8));
                route.setDistance2_3(resultSet.getInt(9));
                route.setDistance3_end(resultSet.getInt(10));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return route;
    }
}
