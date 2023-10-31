package com.parasticaret.api.model.productmodels;

import com.parasticaret.api.model.ordermodels.Coupon;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Coupon> coupons;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<SubCategory> subCategories;

    public Category(Long id, String name, Set<Coupon> coupons, Set<SubCategory> subCategories) {
        this.id = id;
        this.name = name;
        this.coupons = coupons;
        this.subCategories = subCategories;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    public Set<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
