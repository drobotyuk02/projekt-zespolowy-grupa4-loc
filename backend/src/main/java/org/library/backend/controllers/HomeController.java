package org.library.backend.controllers;

import org.library.backend.models.Person;
import org.library.backend.security.PersonDetails;
import org.library.backend.util.error.GeneralErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index() {
        return "Home, sweet home...";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }

    @GetMapping("/user")
    public String user() {
        return "User";
    }

    @GetMapping("/currentUserInfo")
    public Person getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() == null) {
            throw new RuntimeException("No auth in context");
        }
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Person userDetails = personDetails.getPerson();
        System.out.println(userDetails);

        return userDetails;
    }

    @ExceptionHandler
    private ResponseEntity<GeneralErrorResponse> handleException(Exception e) {
        GeneralErrorResponse res = new GeneralErrorResponse();
        res.setMessage(e.getMessage());
        res.setTime(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
