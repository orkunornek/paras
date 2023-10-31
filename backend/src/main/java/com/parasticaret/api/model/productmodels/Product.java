package com.parasticaret.api.model.productmodels;

import com.parasticaret.api.model.ordermodels.Coupon;
import com.parasticaret.api.model.ordermodels.OrderLine;
import com.parasticaret.api.model.usermodels.ShoppingCartItem;
import com.parasticaret.api.model.usermodels.CustomerFavoriteItem;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="productgroup_id")
    private ProductGroup productGroup;
    private double rate;
    private boolean isActive;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Coupon> coupons;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<CustomerFavoriteItem> customerFavoriteItems;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<ShoppingCartItem> shoppingCartItems;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<OrderLine> orderLines;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Attribute> attributes;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Variant> variants;

    public Product(Long id, String title, String description, ProductGroup productGroup, double rate,
                   boolean isActive, Set<Coupon> coupons, Set<CustomerFavoriteItem> customerFavoriteItems,
                   Set<ShoppingCartItem> shoppingCartItems, Set<OrderLine> orderLines, Set<Attribute> attributes, Set<Variant> variants) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.productGroup = productGroup;
        this.rate = rate;
        this.isActive = isActive;
        this.coupons = coupons;
        this.customerFavoriteItems = customerFavoriteItems;
        this.shoppingCartItems = shoppingCartItems;
        this.orderLines = orderLines;
        this.attributes = attributes;
        this.variants = variants;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    public Set<CustomerFavoriteItem> getUserFavoriteItems() {
        return customerFavoriteItems;
    }

    public void setUserFavoriteItems(Set<CustomerFavoriteItem> customerFavoriteItems) {
        this.customerFavoriteItems = customerFavoriteItems;
    }

    public Set<ShoppingCartItem> getShoppingCartItems() {
        return shoppingCartItems;
    }

    public void setShoppingCartItems(Set<ShoppingCartItem> shoppingCartItems) {
        this.shoppingCartItems = shoppingCartItems;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Set<Variant> getVariants() {
        return variants;
    }

    public void setVariants(Set<Variant> variants) {
        this.variants = variants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(rate, product.rate) == 0 && isActive == product.isActive && Objects.equals(id, product.id)
                && Objects.equals(title, product.title) && Objects.equals(description, product.description)
                && Objects.equals(productGroup, product.productGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, productGroup, rate, isActive);
    }
}
