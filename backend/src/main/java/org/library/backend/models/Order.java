package org.library.backend.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Order {
    @Basic
    @Column(name = "Date_due_to", nullable = true)
    private Date dateDueTo;
    @Basic
    @Column(name = "Date_rent_from", nullable = true)
    private Date dateRentFrom;
    @Basic
    @Column(name = "Description", nullable = true, length = 250)
    private String description;
    @Basic
    @Column(name = "Order_date", nullable = true)
    private Date orderDate;
    @Basic
    @Column(name = "Quantity", nullable = true)
    private Integer quantity;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "PersonID", nullable = true)
    private Integer personId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PersonID")
    private Person personID;

    public Person getPersonID() {
        return personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
    }

    public Date getDateDueTo() {
        return dateDueTo;
    }

    public void setDateDueTo(Date dateDueTo) {
        this.dateDueTo = dateDueTo;
    }

    public Date getDateRentFrom() {
        return dateRentFrom;
    }

    public void setDateRentFrom(Date dateRentFrom) {
        this.dateRentFrom = dateRentFrom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (dateDueTo != null ? !dateDueTo.equals(order.dateDueTo) : order.dateDueTo != null) return false;
        if (dateRentFrom != null ? !dateRentFrom.equals(order.dateRentFrom) : order.dateRentFrom != null) return false;
        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
        if (quantity != null ? !quantity.equals(order.quantity) : order.quantity != null) return false;
        if (personId != null ? !personId.equals(order.personId) : order.personId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dateDueTo != null ? dateDueTo.hashCode() : 0;
        result = 31 * result + (dateRentFrom != null ? dateRentFrom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + orderId;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        return result;
    }
}
