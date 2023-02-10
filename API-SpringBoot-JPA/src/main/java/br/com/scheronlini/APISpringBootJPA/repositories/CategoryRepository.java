package br.com.scheronlini.APISpringBootJPA.repositories;

import br.com.scheronlini.APISpringBootJPA.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
