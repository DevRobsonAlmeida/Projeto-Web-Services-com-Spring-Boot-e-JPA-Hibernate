/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robson.projeto.course.services;

import br.com.robson.projeto.course.entites.Product;
import br.com.robson.projeto.course.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 99030499
 */
@Service
public class ProductServices {
    
    @Autowired
    private ProductRepository repository;
    
    public List<Product> findAll(){
        return repository.findAll();
    }
    
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
