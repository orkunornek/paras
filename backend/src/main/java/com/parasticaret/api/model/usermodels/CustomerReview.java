package com.parasticaret.api.model.usermodels;

import com.parasticaret.api.model.ordermodels.OrderLine;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class CustomerReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OrderLine orderLine;
    private double rate;
    private String comment;

    public CustomerReview(Long id, Customer customer, OrderLine orderLine, double rate, String comment) {
        this.id = id;
        this.customer = customer;
        this.orderLine = orderLine;
        this.rate = rate;
        this.comment = comment;
    }

    public CustomerReview() {
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

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerReview that = (CustomerReview) o;
        return Double.compare(rate, that.rate) == 0 && Objects.equals(id, that.id) && Objects.equals(customer, that.customer) && Objects.equals(orderLine, that.orderLine) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, orderLine, rate, comment);
    }
}
