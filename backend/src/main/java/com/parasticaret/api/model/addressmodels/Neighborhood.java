package com.parasticaret.api.model.addressmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Neighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="district_id")
    private District district;
    private String name;
    private int postalCode;

    @OneToMany(mappedBy = "neighborhood", fetch = FetchType.LAZY)
    private Set<Address> addresses;

    public Neighborhood(Long id, District district, String name, int postalCode, Set<Address> addresses) {
        this.id = id;
        this.district = district;
        this.name = name;
        this.postalCode = postalCode;
        this.addresses = addresses;
    }

    public Neighborhood() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighborhood that = (Neighborhood) o;
        return postalCode == that.postalCode && Objects.equals(id, that.id) && Objects.equals(district, that.district) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, district, name, postalCode);
    }
}
