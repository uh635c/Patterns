package com.uh635c.patterns.creational.builder;

public class House {
    private String building;
    private String pool;
    private String sauna;

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getSauna() {
        return sauna;
    }

    public void setSauna(String sauna) {
        this.sauna = sauna;
    }

    @Override
    public String toString() {
        return "House{" +
                "building='" + building + '\'' +
                ", pool='" + pool + '\'' +
                ", sauna='" + sauna + '\'' +
                '}';
    }
}
