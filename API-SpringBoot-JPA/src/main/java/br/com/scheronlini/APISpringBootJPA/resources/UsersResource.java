package br.com.scheronlini.APISpringBootJPA.resources;

import br.com.scheronlini.APISpringBootJPA.entities.User;
import br.com.scheronlini.APISpringBootJPA.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/users")
public class UsersResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable long id){
        var user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
