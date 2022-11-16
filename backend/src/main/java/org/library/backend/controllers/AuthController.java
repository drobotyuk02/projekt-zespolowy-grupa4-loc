package org.library.backend.controllers;

import org.library.backend.dto.BasicPersonLoginDTO;
import org.library.backend.dto.PersonDTO;
import org.library.backend.models.Person;
import org.library.backend.services.RegistrationService;
import org.library.backend.util.validator.PersonValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final RegistrationService registrationService;
    private final PersonValidator personValidator;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthController(RegistrationService registrationService, PersonValidator personValidator, ModelMapper modelMapper) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/registration")
    ////Not model attribute, but RequestBody with DTO?
    public String registrationPage(@ModelAttribute("person") Person person) {
        return "register";
    }

    @PostMapping("/registration")
    //Not model attribute, but RequestBody with DTO?
    public String performRegistration(@ModelAttribute("person") @Valid Person person,
                                      BindingResult bindingResult) {
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return "register";

        registrationService.register(person);

        return "redirect:/auth/login";
    }

    @PostMapping("/login")
    public Map<String, String> performLogin(@RequestBody BasicPersonLoginDTO authDTO) {
        // TODO
        return null;
    }

    public Person convertToPerson(PersonDTO personDTO) {
        return this.modelMapper.map(personDTO, Person.class);
    }

    public PersonDTO convertToDTO(Person person) {
        return this.modelMapper.map(person, PersonDTO.class);
    }

}
