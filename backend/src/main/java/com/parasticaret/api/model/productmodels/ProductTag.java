package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class ProductTag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="subcategory_id")
    private SubCategory subCategory;

    private String name;

    @OneToMany(mappedBy = "productTag", fetch = FetchType.LAZY)
    private Set<ProductGroup> productGroups;

    public ProductTag(Long id, SubCategory subCategory, String name, Set<ProductGroup> productGroups) {
        this.id = id;
        this.subCategory = subCategory;
        this.name = name;
        this.productGroups = productGroups;
    }

    public ProductTag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductGroup> getProductGroups() {
        return productGroups;
    }

    public void setProductGroups(Set<ProductGroup> productGroups) {
        this.productGroups = productGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTag that = (ProductTag) o;
        return Objects.equals(id, that.id) && Objects.equals(subCategory, that.subCategory) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subCategory, name);
    }
}
