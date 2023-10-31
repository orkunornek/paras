package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;
    private String name;

    @OneToMany(mappedBy = "subCategory", fetch = FetchType.LAZY)
    private Set<ProductTag> productTags;

    public SubCategory(Long id, Category category, String name, Set<ProductTag> productTags) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.productTags = productTags;
    }

    public SubCategory() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductTag> getProductTags() {
        return productTags;
    }

    public void setProductTags(Set<ProductTag> productTags) {
        this.productTags = productTags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubCategory that = (SubCategory) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name);
    }
}
