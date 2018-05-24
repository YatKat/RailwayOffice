package model.entity;

public class Routes {
    private int id;
    private String startStation;
    private String station1;
    private String station2;
    private String station3;
    private String endStation;
    private int totalDistance;
    private int distanceStart_1;
    private int distance1_2;
    private int distance2_3;
    private int distance3_end;


    public Routes() {
    }

    public Routes(String startStation, String endStation, int totalDistance) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.totalDistance = totalDistance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getStation1() {
        return station1;
    }

    public void setStation1(String station1) {
        this.station1 = station1;
    }

    public String getStation2() {
        return station2;
    }

    public void setStation2(String station2) {
        this.station2 = station2;
    }

    public String getStation3() {
        return station3;
    }

    public void setStation3(String station3) {
        this.station3 = station3;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public int getDistanceStart_1() {
        return distanceStart_1;
    }

    public void setDistanceStart_1(int distanceStart_1) {
        this.distanceStart_1 = distanceStart_1;
    }

    public int getDistance1_2() {
        return distance1_2;
    }

    public void setDistance1_2(int distance1_2) {
        this.distance1_2 = distance1_2;
    }

    public int getDistance2_3() {
        return distance2_3;
    }

    public void setDistance2_3(int distance2_3) {
        this.distance2_3 = distance2_3;
    }

    public int getDistance3_end() {
        return distance3_end;
    }

    public void setDistance3_end(int distance3_end) {
        this.distance3_end = distance3_end;
    }

    @Override
    public java.lang.String toString() {
        return "Routes: " + "startStation = " + startStation +
                ", endStation = " + endStation +
                ", .";
    }
}
