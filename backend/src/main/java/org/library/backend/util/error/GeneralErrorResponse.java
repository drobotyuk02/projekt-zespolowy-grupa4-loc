package org.library.backend.util.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;


@Data
public class GeneralErrorResponse {
    private String message;
    private Timestamp time;
}
