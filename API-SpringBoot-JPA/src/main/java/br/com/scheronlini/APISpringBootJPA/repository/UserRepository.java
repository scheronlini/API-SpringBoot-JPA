package br.com.scheronlini.APISpringBootJPA.repository;

import br.com.scheronlini.APISpringBootJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
