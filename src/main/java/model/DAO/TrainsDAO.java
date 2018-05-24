package model.DAO;

import model.DBConnection.ConnectionPool;
import model.entity.Routes;
import model.entity.Trains;
import model.entity.Vans;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrainsDAO {

    public static List<Trains> findTrainByClientApp(List<String> clientApp) {
        Connection conn;
        PreparedStatement prepStat = null;
        ResultSet rs = null;
        List<Trains> listOfTrains = new ArrayList<Trains>();
        String prepStatement = "SELECT * FROM trains WHERE idRoute = ? AND date = ?;";
        try {
            conn = ConnectionPool.getConn();
            prepStat = conn.prepareStatement(prepStatement);
            prepStat.setInt(1, RoutesDAO.findRoute(clientApp).getId());
            prepStat.setString(2, clientApp.get(2));
            rs = prepStat.executeQuery();
            while (rs.next()){
                Trains train = new Trains();
                train.setIdTrain(rs.getInt(1));
                Routes route = new Routes();
                route.setId(rs.getInt(2));
                train.setRoute(route);
                Vans van = new Vans();
                van.setIdVan(rs.getInt(3));
                train.setVan(van);
                train.setDate(rs.getString(4));
                train.setDepartureTime(rs.getString(5));
                listOfTrains.add(train);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfTrains;
    }
}
