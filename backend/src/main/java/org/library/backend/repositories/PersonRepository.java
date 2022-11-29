package org.library.backend.repositories;

import org.library.backend.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    public Optional<Person> findByUsername(String username);
    public Optional<Person> findByEmail(String email);
}