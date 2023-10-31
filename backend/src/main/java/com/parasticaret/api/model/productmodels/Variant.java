package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Variant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="varianttype_id")
    private VariantType variantType;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="productgroup_id")
    private ProductGroup productGroup;
    private String value;
    private int stock;
    private double price;
    private boolean isActive;

    public Variant(Long id, VariantType variantType, Product product, ProductGroup productGroup, String value, int stock, double price, boolean isActive) {
        this.id = id;
        this.variantType = variantType;
        this.product = product;
        this.productGroup = productGroup;
        this.value = value;
        this.stock = stock;
        this.price = price;
        this.isActive = isActive;
    }

    public Variant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VariantType getVariantType() {
        return variantType;
    }

    public void setVariantType(VariantType variantType) {
        this.variantType = variantType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variant variant = (Variant) o;
        return stock == variant.stock && Double.compare(price, variant.price) == 0 && isActive == variant.isActive
                && Objects.equals(id, variant.id) && Objects.equals(variantType, variant.variantType)
                && Objects.equals(product, variant.product) && Objects.equals(productGroup, variant.productGroup)
                && Objects.equals(value, variant.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, variantType, product, productGroup, value, stock, price, isActive);
    }
}
