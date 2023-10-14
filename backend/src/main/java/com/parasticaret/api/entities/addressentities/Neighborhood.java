package com.parasticaret.api.entities.addressentities;

public class Neighborhood {
    private int id;
    private int districtId;
    private String name;
    private int postalCode;

    public Neighborhood(int id, int districtId, String name, int postalCode) {
        this.id = id;
        this.districtId = districtId;
        this.name = name;
        this.postalCode = postalCode;
    }

    public Neighborhood() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
