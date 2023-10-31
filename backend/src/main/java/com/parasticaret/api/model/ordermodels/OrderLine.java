package com.parasticaret.api.model.ordermodels;

import com.parasticaret.api.model.productmodels.Product;
import com.parasticaret.api.model.usermodels.CustomerReview;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private int quantity;
    private double totalAmount;
    private double lineAmount;

    @OneToOne(mappedBy = "orderLine", fetch = FetchType.LAZY)
    private CustomerReview customerReview;

    public OrderLine(Long id, Order order, Product product, int quantity, double totalAmount, double lineAmount, CustomerReview customerReview) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.lineAmount = lineAmount;
        this.customerReview = customerReview;
    }

    public OrderLine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(double lineAmount) {
        this.lineAmount = lineAmount;
    }

    public CustomerReview getUserReviews() {
        return customerReview;
    }

    public void setUserReviews(CustomerReview customerReview) {
        this.customerReview = customerReview;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity && Double.compare(totalAmount, orderLine.totalAmount) == 0
                && Double.compare(lineAmount, orderLine.lineAmount) == 0 && Objects.equals(id, orderLine.id)
                && Objects.equals(order, orderLine.order) && Objects.equals(product, orderLine.product)
                && Objects.equals(customerReview, orderLine.customerReview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order, product, quantity, totalAmount, lineAmount, customerReview);
    }
}
