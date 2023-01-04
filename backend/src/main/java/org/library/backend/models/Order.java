package org.library.backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.library.backend.util.constants.OrderType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID", nullable = false)
    private Integer id;

    @Column(name = "Date_due_to")
    private LocalDate dateDueTo;

    @Column(name = "Date_rent_from")
    private LocalDate dateRentFrom;

    @Size(max = 150)
    @Column(name = "Description", length = 150)
    private String description;

    @Column(name = "Order_date")
    private LocalDate orderDate;

    @Column(name = "Quantity")
    private Integer quantity;

    @Size(max = 20)
    @Column(name = "Status", length = 20)
    private String status;

    @Size(max = 5)
    @Column(name = "Type", length = 5)
    private String type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PersonID", nullable = false)
    @JsonBackReference
    private Person personID;

    @OneToMany(mappedBy = "orderID")
    @JsonManagedReference
    private Set<Product> products = new LinkedHashSet<>();

    @OneToMany(mappedBy = "orderID")
    @JsonManagedReference
    private Set<Address> addresses = new LinkedHashSet<>();

}