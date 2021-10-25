/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robson.projeto.course.services;

import br.com.robson.projeto.course.entites.User;
import br.com.robson.projeto.course.repository.UserRepository;
import br.com.robson.projeto.course.services.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author 99030499
 */
@Service
public class UserServices {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> findAll(){
        return repository.findAll();
    }
    
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    
    public User insert(User obj){
        return repository.save(obj);
    }
    
    public void delete(Long id){
        repository.deleteById(id);
    }
    
    public User update(Long id, User obj){
        User entity = repository.getOne(id);
        updadteData(entity, obj);
        return repository.save(entity);
    }

    private void updadteData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
        
    }
    
}
