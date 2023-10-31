package com.parasticaret.api.model.productmodels;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class AttributeType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "attributeType", fetch = FetchType.LAZY)
    private Set<Attribute> attributes;

    public AttributeType(Long id, String name, Set<Attribute> attributes) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
    }

    public AttributeType() {
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

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeType that = (AttributeType) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
