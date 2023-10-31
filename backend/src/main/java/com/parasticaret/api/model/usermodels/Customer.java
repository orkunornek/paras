package com.parasticaret.api.model.usermodels;

import com.parasticaret.api.model.addressmodels.Address;
import com.parasticaret.api.model.ordermodels.Order;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import java.util.Objects;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDateTime birthday;
    private int gender;
    private boolean isActive;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Order> orders;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Address> addresses;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<CustomerReview> customerReviews;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<CustomerCoupon> customerCoupons;
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CustomerFavorite customerFavorite;
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ShoppingCart shoppingCart;

    public Customer(Long id, String firstName, String lastName, String email, String password, String phoneNumber,
                    LocalDateTime birthday, int gender, boolean isActive, Set<Order> orders, Set<Address> addresses,
                    Set<CustomerReview> customerReviews, Set<CustomerCoupon> customerCoupons, CustomerFavorite customerFavorite,
                    ShoppingCart shoppingCart) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.gender = gender;
        this.isActive = isActive;
        this.orders = orders;
        this.addresses = addresses;
        this.customerReviews = customerReviews;
        this.customerCoupons = customerCoupons;
        this.customerFavorite = customerFavorite;
        this.shoppingCart = shoppingCart;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<CustomerReview> getUserReviews() {
        return customerReviews;
    }

    public void setUserReviews(Set<CustomerReview> customerReviews) {
        this.customerReviews = customerReviews;
    }

    public Set<CustomerCoupon> getUserCoupons() {
        return customerCoupons;
    }

    public void setUserCoupons(Set<CustomerCoupon> customerCoupons) {
        this.customerCoupons = customerCoupons;
    }

    public CustomerFavorite getUserFavorite() {
        return customerFavorite;
    }

    public void setUserFavorite(CustomerFavorite customerFavorite) {
        this.customerFavorite = customerFavorite;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return gender == customer.gender && isActive == customer.isActive && Objects.equals(id, customer.id)
                && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName)
                && Objects.equals(email, customer.email) && Objects.equals(password, customer.password)
                && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(birthday, customer.birthday)
                && Objects.equals(customerFavorite, customer.customerFavorite) && Objects.equals(shoppingCart, customer.shoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password, phoneNumber, birthday, gender, isActive, customerFavorite, shoppingCart);
    }
}
