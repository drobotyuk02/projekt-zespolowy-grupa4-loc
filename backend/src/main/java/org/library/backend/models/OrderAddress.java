package org.library.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "Order_address", schema = "public", catalog = "app_database")
public class OrderAddress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Order_addressID", nullable = false)
    private int orderAddressId;
    @Basic
    @Column(name = "OrderID", nullable = false)
    private int orderId;

    public int getOrderAddressId() {
        return orderAddressId;
    }

    public void setOrderAddressId(int orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderAddress that = (OrderAddress) o;

        if (orderAddressId != that.orderAddressId) return false;
        if (orderId != that.orderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderAddressId;
        result = 31 * result + orderId;
        return result;
    }
}
