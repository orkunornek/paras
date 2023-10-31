package com.parasticaret.api.model.addressmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;
    private String name;

    @OneToMany(mappedBy = "district", fetch = FetchType.LAZY)
    private Set<Neighborhood> neighborhoods;

    public District(Long id, City city, String name, Set<Neighborhood> neighborhoods) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.neighborhoods = neighborhoods;
    }

    public District() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Neighborhood> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(Set<Neighborhood> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id) && Objects.equals(city, district.city) && Objects.equals(name, district.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, name);
    }
}
