package org.library.backend.controllers;

import org.library.backend.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {

    UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    @ResponseBody
    public String index() {
        return usersService.findAll().toString();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String findById(@PathVariable("id") int id){
        return usersService.findById(id).toString();
    }
}
