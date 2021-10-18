/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robson.projeto.course.services;

import br.com.robson.projeto.course.entites.OrderItem;
import br.com.robson.projeto.course.repository.OrderItemRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 99030499
 */
@Service
public class OrderItemServices {
    
    @Autowired
    private OrderItemRepository repository;
    
    public List<OrderItem> findAll(){
        return repository.findAll();
    }
    
    public OrderItem findById(Long id){
        Optional<OrderItem> obj = repository.findById(id);
        return obj.get();
    }
}
