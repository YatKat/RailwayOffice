package model.IDAO;

import model.entity.Stations;

import java.util.List;

public interface IStationDAO {

    //Returns all rows from table
   List<Stations> getAllStations();

    //Returns stations correspond to the specified pattern
   List<String> getStationsLike(java.lang.String likePattern);

    //Returns stations correspond to the specified id
   List<String> getStationById(int id);
}
