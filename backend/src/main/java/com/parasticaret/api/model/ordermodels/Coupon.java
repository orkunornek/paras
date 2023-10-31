package com.parasticaret.api.model.ordermodels;

import com.parasticaret.api.model.productmodels.Category;
import com.parasticaret.api.model.productmodels.Product;
import com.parasticaret.api.model.usermodels.CustomerCoupon;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private double discountAmount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private double cartLowerAmount;
    @OneToMany(mappedBy = "coupon", fetch = FetchType.LAZY)
    private Set<CustomerCoupon> customerCoupons;

    public Coupon(Long id, Category category, Product product, double discountAmount,
                  LocalDateTime startTime, LocalDateTime endTime, String description,
                  double cartLowerAmount, Set<CustomerCoupon> customerCoupons) {
        this.id = id;
        this.category = category;
        this.product = product;
        this.discountAmount = discountAmount;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.cartLowerAmount = cartLowerAmount;
        this.customerCoupons = customerCoupons;
    }

    public Coupon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCartLowerAmount() {
        return cartLowerAmount;
    }

    public void setCartLowerAmount(double cartLowerAmount) {
        this.cartLowerAmount = cartLowerAmount;
    }

    public Set<CustomerCoupon> getUserCoupons() {
        return customerCoupons;
    }

    public void setUserCoupons(Set<CustomerCoupon> customerCoupons) {
        this.customerCoupons = customerCoupons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coupon coupon = (Coupon) o;
        return Double.compare(discountAmount, coupon.discountAmount) == 0 && Double.compare(cartLowerAmount, coupon.cartLowerAmount) == 0
                && Objects.equals(id, coupon.id) && Objects.equals(category, coupon.category) && Objects.equals(product, coupon.product)
                && Objects.equals(startTime, coupon.startTime) && Objects.equals(endTime, coupon.endTime) && Objects.equals(description, coupon.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, product, discountAmount, startTime, endTime, description, cartLowerAmount);
    }
}
