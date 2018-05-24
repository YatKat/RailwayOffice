package model.entity;

public class Trains {
    private int idTrain;
    private Routes route;
    private Vans van;
    private String date;
    private String departureTime;

    public Trains (){

    }

    public Trains(int id, Routes route, Vans van, String date, String departureTime) {
        this.idTrain = id;
        this.route = route;
        this.van = van;
        this.date = date;
        this.departureTime = departureTime;
    }

    public int getIdTrain() {
        return idTrain;
    }

    public Routes getRoute() {
        return route;
    }

    public Vans getVan() {
        return van;
    }

    public void setIdTrain(int idTrain) {
        this.idTrain = idTrain;
    }

    public void setRoute(Routes route) {
        this.route = route;
    }

    public void setVan(Vans van) {
        this.van = van;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trains { ");
        sb.append("IdTrain=").append(idTrain);
        sb.append(",Routes = '").append(route).append('\'');
        sb.append(", Van = ").append(van);
        sb.append(", Date = ").append(date);
        sb.append(", Departure Time = ").append(departureTime);
        sb.append('}');
        return sb.toString();
    }
}
