package br.com.scheronlini.APISpringBootJPA.services;

import br.com.scheronlini.APISpringBootJPA.entities.Category;
import br.com.scheronlini.APISpringBootJPA.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}
