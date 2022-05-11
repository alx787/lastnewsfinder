package ru.alx.tracker.finder.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "coordinates")
public class Coordinates {

    private int id;
    private Double lon;
    private Double lat;
    private Timestamp clientDate;
    private Timestamp serverDate;

    public Coordinates() {
    }

    public Coordinates(Double lon, Double lat, Timestamp clientDate, Timestamp serverDate) {
        this.lon = lon;
        this.lat = lat;
        this.clientDate = clientDate;
        this.serverDate = serverDate;
    }

    public Coordinates(int id, Double lon, Double lat, Timestamp clientDate, Timestamp serverDate) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
        this.clientDate = clientDate;
        this.serverDate = serverDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lon", nullable = false)
    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Basic
    @Column(name = "lat", nullable = false)
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "clientdate", nullable = false)
    public Timestamp getClientDate() {
        return clientDate;
    }

    public void setClientDate(Timestamp clientDate) {
        this.clientDate = clientDate;
    }

    @Basic
    @Column(name = "serverdate", nullable = false)
    public Timestamp getServerDate() {
        return serverDate;
    }

    public void setServerDate(Timestamp serverDate) {
        this.serverDate = serverDate;
    }
}
