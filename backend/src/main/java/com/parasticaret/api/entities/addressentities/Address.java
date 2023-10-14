package com.parasticaret.api.entities.addressentities;

public class Address {
    private int id;
    private int neighborhoodId;
    private int userId;
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

    public Address(int id, int neighborhoodId, int userId, String firstName,
                   String lastName, String phoneNumber, String addressTitle, String addressDescription,
                   boolean invoiceType, String taxIdentificationNumber, String taxAdministration, String companyName, boolean isActive) {
        this.id = id;
        this.neighborhoodId = neighborhoodId;
        this.userId = userId;
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
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(int neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
}
