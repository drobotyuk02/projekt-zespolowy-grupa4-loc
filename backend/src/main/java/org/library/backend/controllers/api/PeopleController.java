package org.library.backend.controllers.api;

import org.library.backend.dto.PersonDTO;
import org.library.backend.models.Person;
import org.library.backend.repositories.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PeopleController {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PeopleController(PersonRepository personRepository, ModelMapper modelMapper) {
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<Person> index() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable int id) {
        return personRepository.findById(id).orElse(null);
    }

    @PatchMapping
    public void updatePerson(@RequestBody PersonDTO personDTO) {
        int id = personDTO.getPersonId();

    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id) {
        personRepository.deleteById(id);
    }

    private Person convertFromDTO(PersonDTO personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }
}
