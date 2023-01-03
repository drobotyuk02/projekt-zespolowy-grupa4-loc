package org.library.backend.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PersonID", nullable = false)
    private Integer id;

    @Column(name = "Created_at")
    private Instant createdAt;

    @Size(max = 60)
    @Column(name = "Email", length = 60)
    private String email;

    @Column(name = "Is_enabled")
    private Boolean isEnabled;

    @Column(name = "Is_restricted")
    private Boolean isRestricted;

    @Size(max = 30)
    @Column(name = "Name", length = 30)
    private String name;

    @Size(max = 75)
    @Column(name = "Password", length = 75)
    private String password;

    @Column(name = "Phone_number")
    private Integer phoneNumber;

    @Size(max = 17)
    @Column(name = "Role", length = 17)
    private String role;

    @Size(max = 50)
    @Column(name = "Surname", length = 50)
    private String surname;

    @Column(name = "Updated_at")
    private Instant updatedAt;

    @Size(max = 30)
    @Column(name = "Username", length = 30)
    private String username;

    @Column(name = "AddressID")
    private Integer addressID;

    @OneToMany(mappedBy = "personID")
    @JsonManagedReference
    private Set<Order> orders = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    @JsonManagedReference
    private Set<RessetPassToken> ressetPassTokens = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    @JsonManagedReference
    private Set<Address> addresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    @JsonManagedReference
    private Set<Subscription> subscriptions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "personID")
    @JsonManagedReference
    private Set<Registration> registrations = new LinkedHashSet<>();

}