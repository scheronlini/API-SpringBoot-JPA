package br.com.scheronlini.APISpringBootJPA.services;

import br.com.scheronlini.APISpringBootJPA.entities.User;
import br.com.scheronlini.APISpringBootJPA.repositories.UserRepository;
import br.com.scheronlini.APISpringBootJPA.resources.exceptions.ResourceExceptionHandler;
import br.com.scheronlini.APISpringBootJPA.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
@Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    public User insert(User user){
         return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id, User user ){
       User entity = userRepository.getReferenceById(id);
       updateData(entity,user);
       return userRepository.save(entity);

    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
