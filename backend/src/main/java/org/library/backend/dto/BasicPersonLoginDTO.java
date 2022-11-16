package org.library.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link org.library.backend.models.Person} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BasicPersonLoginDTO implements Serializable {
    @NotEmpty(message = "Username can not be empty")
    @Size(min = 2, max = 30, message = "Username should be between 2 and 30 characters long")
    private String username;
    private String password;
}