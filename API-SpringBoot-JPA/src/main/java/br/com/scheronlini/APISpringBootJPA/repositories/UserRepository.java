package br.com.scheronlini.APISpringBootJPA.repositories;

import br.com.scheronlini.APISpringBootJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
