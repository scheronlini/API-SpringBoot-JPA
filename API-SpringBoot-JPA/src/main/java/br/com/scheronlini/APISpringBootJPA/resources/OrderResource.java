package br.com.scheronlini.APISpringBootJPA.resources;

import br.com.scheronlini.APISpringBootJPA.entities.Order;
import br.com.scheronlini.APISpringBootJPA.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orders = orderService.findAll();
        return ResponseEntity.ok().body(orders);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        var order = orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }

}
