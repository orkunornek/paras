package com.parasticaret.api.model.usermodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class CustomerFavorite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "customerFavorite", fetch = FetchType.LAZY)
    private Set<CustomerFavoriteItem> customerFavoriteItems;

    public CustomerFavorite(Long id, Customer customer, Set<CustomerFavoriteItem> customerFavoriteItems) {
        this.id = id;
        this.customer = customer;
        this.customerFavoriteItems = customerFavoriteItems;
    }

    public CustomerFavorite() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getUser() {
        return customer;
    }

    public void setUser(Customer customer) {
        this.customer = customer;
    }

    public Set<CustomerFavoriteItem> getUserFavoriteItems() {
        return customerFavoriteItems;
    }

    public void setUserFavoriteItems(Set<CustomerFavoriteItem> customerFavoriteItems) {
        this.customerFavoriteItems = customerFavoriteItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFavorite that = (CustomerFavorite) o;
        return Objects.equals(id, that.id) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer);
    }
}
