package com.parasticaret.api.model.addressmodels;

import com.parasticaret.api.model.ordermodels.Order;
import com.parasticaret.api.model.usermodels.Customer;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="neighborhood_id")
    private Neighborhood neighborhood;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String addressTitle;
    private String addressDescription;
    private boolean invoiceType;
    private String taxIdentificationNumber;
    private String taxAdministration;
    private String companyName;
    private boolean isActive;
    @OneToMany(mappedBy = "orderAddress", fetch = FetchType.LAZY)
    private Set<Order> asOrderAddress;
    @OneToMany(mappedBy = "invoiceAddress", fetch = FetchType.LAZY)
    private Set<Order> asInvoiceAddress;

    public Address(Long id, Neighborhood neighborhood, Customer customer, String firstName,
                   String lastName, String phoneNumber, String addressTitle, String addressDescription,
                   boolean invoiceType, String taxIdentificationNumber, String taxAdministration, String companyName,
                   boolean isActive, Set<Order> asOrderAddress, Set<Order> asInvoiceAddress) {
        this.id = id;
        this.neighborhood = neighborhood;
        this.customer = customer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.addressTitle = addressTitle;
        this.addressDescription = addressDescription;
        this.invoiceType = invoiceType;
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.taxAdministration = taxAdministration;
        this.companyName = companyName;
        this.isActive = isActive;
        this.asOrderAddress = asOrderAddress;
        this.asInvoiceAddress = asInvoiceAddress;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Customer getUser() {
        return customer;
    }

    public void setUser(Customer customer) {
        this.customer = customer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public boolean isInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(boolean invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getTaxAdministration() {
        return taxAdministration;
    }

    public void setTaxAdministration(String taxAdministration) {
        this.taxAdministration = taxAdministration;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Set<Order> getAsOrderAddress() {
        return asOrderAddress;
    }

    public void setAsOrderAddress(Set<Order> asOrderAddress) {
        this.asOrderAddress = asOrderAddress;
    }

    public Set<Order> getAsInvoiceAddress() {
        return asInvoiceAddress;
    }

    public void setAsInvoiceAddress(Set<Order> asInvoiceAddress) {
        this.asInvoiceAddress = asInvoiceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return invoiceType == address.invoiceType && isActive == address.isActive && Objects.equals(id, address.id) &&
                Objects.equals(neighborhood, address.neighborhood) && Objects.equals(customer, address.customer) &&
                Objects.equals(firstName, address.firstName) && Objects.equals(lastName, address.lastName) &&
                Objects.equals(phoneNumber, address.phoneNumber) && Objects.equals(addressTitle, address.addressTitle) &&
                Objects.equals(addressDescription, address.addressDescription) && Objects.equals(taxIdentificationNumber, address.taxIdentificationNumber) &&
                Objects.equals(taxAdministration, address.taxAdministration) && Objects.equals(companyName, address.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, neighborhood, customer, firstName, lastName, phoneNumber, addressTitle, addressDescription,
                invoiceType, taxIdentificationNumber, taxAdministration, companyName, isActive);
    }
}
