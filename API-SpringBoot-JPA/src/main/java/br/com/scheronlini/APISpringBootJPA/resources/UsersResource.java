package br.com.scheronlini.APISpringBootJPA.resources;

import br.com.scheronlini.APISpringBootJPA.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UsersResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(89L,"joao","joao@gmail.com","47-9999-9999","123");
        return ResponseEntity.ok().body(u);

    }
}
