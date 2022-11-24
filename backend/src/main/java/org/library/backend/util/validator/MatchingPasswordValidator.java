package org.library.backend.util.validator;

import org.library.backend.dto.PersonRegistrationDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchingPasswordValidator implements ConstraintValidator<MatchingPassword, Object> {
    @Override
    public void initialize(MatchingPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        PersonRegistrationDTO regDTO = (PersonRegistrationDTO) value;
        return regDTO.getPassword().equals(regDTO.getRepeatedPassword());
    }
}
