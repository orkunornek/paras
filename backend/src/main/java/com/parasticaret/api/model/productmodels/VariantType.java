package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class VariantType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int displayType;

    @OneToMany(mappedBy = "variantType", fetch = FetchType.LAZY)
    private Set<Variant> variants;

    public VariantType(Long id, String name, int displayType, Set<Variant> variants) {
        this.id = id;
        this.name = name;
        this.displayType = displayType;
        this.variants = variants;
    }

    public VariantType() {
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

    public int getDisplayType() {
        return displayType;
    }

    public void setDisplayType(int displayType) {
        this.displayType = displayType;
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
        VariantType that = (VariantType) o;
        return displayType == that.displayType && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayType);
    }
}
