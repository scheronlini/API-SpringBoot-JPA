package br.com.scheronlini.APISpringBootJPA.repositories;

import br.com.scheronlini.APISpringBootJPA.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
