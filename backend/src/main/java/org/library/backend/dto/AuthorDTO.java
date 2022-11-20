package org.library.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;

/**
 * A DTO for the {@link org.library.backend.models.Author} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AuthorDTO implements Serializable {
    private String alternativeName;
    private String authorInfo;
    private Date dateOfBirth;
    private Date dateOfDeath;
    private String name;
    private String surname;
}