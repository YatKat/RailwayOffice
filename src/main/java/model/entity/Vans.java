package model.entity;

public class Vans {
    private int idVan;
    private String vanType;
    private int idSeat;

    public Vans() {
    }

    public Vans(int idVan, String vanType) {
        this.idVan = idVan;
        this.vanType = vanType;
    }

    public int getIdVan() {
        return idVan;
    }

    public void setIdVan(int idVan) {
        this.idVan = idVan;
    }

    public String getVanType() {
        return vanType;
    }

    public void setVanType(String vanType) {
        this.vanType = vanType;
    }

    public int getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(int idSeat) {
        this.idSeat = idSeat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Van { ");
        sb.append("idVan = ").append(idVan);
        sb.append(", Van type = '").append(vanType).append('\'');
        sb.append(" }");
        return sb.toString();
    }
}
