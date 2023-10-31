package com.parasticaret.api.model.ordermodels;

import com.parasticaret.api.model.addressmodels.Address;
import com.parasticaret.api.model.shipmentmodels.Shipment;
import com.parasticaret.api.model.usermodels.Customer;
import com.parasticaret.api.model.usermodels.CustomerCoupon;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Shipment shipment;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="invoiceadress_id")
    private Address invoiceAddress;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="orderadress_id")
    private Address orderAddress;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="orderstatus_id")
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<CustomerCoupon> customerCoupons;
    private int invoicePaperLink;
    private double grossAmount;
    private double totalAmount;
    private double totalDiscount;
    private LocalDateTime orderTime;
    private String orderNote;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderLine> orderLines;

    public Order(Long id, Customer customer, Shipment shipment, Address invoiceAddress,
                 Address orderAddress, OrderStatus orderStatus, Set<CustomerCoupon> customerCoupons, int invoicePaperLink,
                 double grossAmount, double totalAmount, double totalDiscount, LocalDateTime orderTime,
                 String orderNote, Set<OrderLine> orderLines) {
        this.id = id;
        this.customer = customer;
        this.shipment = shipment;
        this.invoiceAddress = invoiceAddress;
        this.orderAddress = orderAddress;
        this.orderStatus = orderStatus;
        this.customerCoupons = customerCoupons;
        this.invoicePaperLink = invoicePaperLink;
        this.grossAmount = grossAmount;
        this.totalAmount = totalAmount;
        this.totalDiscount = totalDiscount;
        this.orderTime = orderTime;
        this.orderNote = orderNote;
        this.orderLines = orderLines;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getUser() {
        return customer;
    }

    public void setUser(Customer customer) {
        this.customer = customer;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Address getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(Address invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public Address getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(Address orderAddress) {
        this.orderAddress = orderAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<CustomerCoupon> getCoupon() {
        return customerCoupons;
    }

    public void setCoupon(Set<CustomerCoupon> customerCoupons) {
        this.customerCoupons = customerCoupons;
    }

    public int getInvoicePaperLink() {
        return invoicePaperLink;
    }

    public void setInvoicePaperLink(int invoicePaperLink) {
        this.invoicePaperLink = invoicePaperLink;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return invoicePaperLink == order.invoicePaperLink && Double.compare(grossAmount, order.grossAmount) == 0 && Double.compare(totalAmount, order.totalAmount) == 0
                && Double.compare(totalDiscount, order.totalDiscount) == 0 && Objects.equals(id, order.id) && Objects.equals(customer, order.customer)
                && Objects.equals(shipment, order.shipment) && Objects.equals(invoiceAddress, order.invoiceAddress) && Objects.equals(orderAddress, order.orderAddress)
                && Objects.equals(orderStatus, order.orderStatus) && Objects.equals(orderTime, order.orderTime)
                && Objects.equals(orderNote, order.orderNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, shipment, invoiceAddress, orderAddress, orderStatus, invoicePaperLink,
                grossAmount, totalAmount, totalDiscount, orderTime, orderNote);
    }
}
