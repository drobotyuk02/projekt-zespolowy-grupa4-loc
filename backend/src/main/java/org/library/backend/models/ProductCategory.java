package org.library.backend.models;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ProductCategory")
public class ProductCategory {
    @EmbeddedId
    private ProductCategoryId id;

}