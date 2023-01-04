package org.library.backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.library.backend.util.constants.ProductType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID", nullable = false)
    private Integer id;

    @Column(name = "Buy_price")
    private BigDecimal buyPrice;

    @Column(name = "Date_of_issue")
    private LocalDate dateOfIssue;

    @Size(max = 200)
    @Column(name = "Description", length = 200)
    private String description;

    //String full_description;

    @Column(name = "Picture_blob")
    private byte[] pictureBlob;

    @Size(max = 150)
    @Column(name = "Picture_url", length = 150)
    private String pictureUrl;

    @Column(name = "Rating")
    private BigDecimal rating;

    @Column(name = "Rent_price")
    private BigDecimal rentPrice;

    @Size(max = 50)
    @Column(name = "Title", length = 50)
    private String title;

    @Size(max = 15)
    @Column(name = "Type", length = 15)
    private String type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AuthorID", nullable = false)
    @JsonBackReference
    private Author authorID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID")
    @JsonBackReference
    private Order orderID;

    @ManyToMany
    @JoinTable(name = "ProductCategory",
            joinColumns = @JoinColumn(name = "ProductID"),
            inverseJoinColumns = @JoinColumn(name = "CategoryID"))
    private Set<Category> categories = new LinkedHashSet<>();

}