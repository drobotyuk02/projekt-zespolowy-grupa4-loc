package org.library.backend.controllers.api;

import org.library.backend.dto.AuthorDTO;
import org.library.backend.models.Author;
import org.library.backend.repositories.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorsController {

    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthorsController(AuthorRepository authorRepository, ModelMapper modelMapper) {
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<Author> index() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable int id) {
        return authorRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Author addNewAuthor(@RequestBody AuthorDTO authorDTO) {
        Author author = convertFromDTO(authorDTO);

        authorRepository.save(author);
        return author;
    }

    @PatchMapping("/{id}")
    public Author updateAuthor(@PathVariable int id, @RequestBody AuthorDTO authorDTO) {
        return convertFromDTO(authorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        authorRepository.deleteById(id);
    }

    private Author convertFromDTO(AuthorDTO authorDTO) {
        return modelMapper.map(authorDTO, Author.class);
    }
}
