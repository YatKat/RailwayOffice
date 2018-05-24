package model.DAO;
import model.DBConnection.ConnectionPool;
import model.IDAO.IStationDAO;
import model.entity.Stations;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StationsDAO implements IStationDAO {

    public List<Stations> getAllStations() {
        Stations stations = new Stations();
        List<Stations> listOfStations = new ArrayList<Stations>();
        try {
            Connection conn = ConnectionPool.getConn();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM stations");
            while (rs.next()) {
               stations.setId(rs.getInt(1));
               stations.setName(rs.getString(2));
               listOfStations.add(stations);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfStations;
    }

    public static int getIdStationByName(String name){
        String stations = new String();
        int id = 0;
        java.lang.String prepStatement = "SELECT idStation FROM stations WHERE nameStation = ?;";
        PreparedStatement prepStat = null;
        try {
            Connection conn = ConnectionPool.getConn();
            prepStat = conn.prepareStatement(prepStatement);
            ResultSet rs = prepStat.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public List<String> getStationsLike(java.lang.String likePattern) {
        return null;
    }

    public List<String> getStationById(int id) {
        return null;
    }
}
