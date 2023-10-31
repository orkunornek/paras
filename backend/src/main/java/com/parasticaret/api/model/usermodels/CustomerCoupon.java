package com.parasticaret.api.model.usermodels;

import com.parasticaret.api.model.ordermodels.Coupon;
import com.parasticaret.api.model.ordermodels.Order;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class CustomerCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="coupon_id")
    private Coupon coupon;
    private boolean isActive;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    public CustomerCoupon(Long id, Customer customer, Coupon coupon, boolean isActive, Order order) {
        this.id = id;
        this.customer = customer;
        this.coupon = coupon;
        this.isActive = isActive;
        this.order = order;
    }

    public CustomerCoupon() {
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

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCoupon that = (CustomerCoupon) o;
        return isActive == that.isActive && Objects.equals(id, that.id) && Objects.equals(customer, that.customer) && Objects.equals(coupon, that.coupon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, coupon, isActive);
    }
}
