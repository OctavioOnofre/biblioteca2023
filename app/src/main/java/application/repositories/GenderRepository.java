package application.repositories;

import org.springframework.data.repository.CrudRepository;

import application.models.Gender;

public interface GenderRepository extends CrudRepository<Gender, Long> {
    
}
