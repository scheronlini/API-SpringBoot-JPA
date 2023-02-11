package br.com.scheronlini.APISpringBootJPA.repositories;

import br.com.scheronlini.APISpringBootJPA.entities.OrderItem;
import br.com.scheronlini.APISpringBootJPA.entities.User;
import br.com.scheronlini.APISpringBootJPA.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
}
