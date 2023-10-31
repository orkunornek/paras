package com.parasticaret.api.model.ordermodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean status;

    @OneToMany(mappedBy = "orderStatus", fetch = FetchType.LAZY)
    private Set<Order> orders;

    public OrderStatus(Long id, boolean status, Set<Order> orders) {
        this.id = id;
        this.status = status;
        this.orders = orders;
    }

    public OrderStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatus that = (OrderStatus) o;
        return status == that.status && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }
}
