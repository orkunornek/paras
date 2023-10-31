package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class ProductGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="producttag_id")
    private ProductTag productTag;
    @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
    private Set<Product> products;
    @OneToMany(mappedBy = "productGroup", fetch = FetchType.LAZY)
    private Set<Variant> variants;

    public ProductGroup(Long id, ProductTag productTag, Set<Product> products, Set<Variant> variants) {
        this.id = id;
        this.productTag = productTag;
        this.products = products;
        this.variants = variants;
    }

    public ProductGroup() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductTag getProductGroup() {
        return productTag;
    }

    public void setProductGroup(ProductTag productGroup) {
        this.productTag = productGroup;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
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
        ProductGroup that = (ProductGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(productTag, that.productTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productTag);
    }
}
