package br.com.scheronlini.APISpringBootJPA.repositories;

import br.com.scheronlini.APISpringBootJPA.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
