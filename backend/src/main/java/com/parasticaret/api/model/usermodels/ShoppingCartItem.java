package com.parasticaret.api.model.usermodels;

import com.parasticaret.api.model.productmodels.Product;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ShoppingCartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="shoppingcart_id")
    private ShoppingCart shoppingCart;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    private int quantity;

    public ShoppingCartItem(Long id, ShoppingCart shoppingCart, Product product, int quantity) {
        this.id = id;
        this.shoppingCart = shoppingCart;
        this.product = product;
        this.quantity = quantity;
    }

    public ShoppingCartItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartItem that = (ShoppingCartItem) o;
        return quantity == that.quantity && Objects.equals(id, that.id) && Objects.equals(shoppingCart, that.shoppingCart) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shoppingCart, product, quantity);
    }
}
