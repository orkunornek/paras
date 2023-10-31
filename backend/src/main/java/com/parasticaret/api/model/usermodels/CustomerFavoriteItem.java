package com.parasticaret.api.model.usermodels;

import com.parasticaret.api.model.productmodels.Product;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class CustomerFavoriteItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customerfavorite_id")
    private CustomerFavorite customerFavorite;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    public CustomerFavoriteItem(Long id, CustomerFavorite customerFavorite, Product product) {
        this.id = id;
        this.customerFavorite = customerFavorite;
        this.product = product;
    }

    public CustomerFavoriteItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerFavorite getUserFavorite() {
        return customerFavorite;
    }

    public void setUserFavorite(CustomerFavorite customerFavorite) {
        this.customerFavorite = customerFavorite;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFavoriteItem that = (CustomerFavoriteItem) o;
        return Objects.equals(id, that.id) && Objects.equals(customerFavorite, that.customerFavorite) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerFavorite, product);
    }
}
