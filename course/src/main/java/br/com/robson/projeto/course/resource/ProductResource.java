/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robson.projeto.course.resource;

import br.com.robson.projeto.course.entites.Category;
import br.com.robson.projeto.course.entites.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robson.projeto.course.services.CategoryServices;
import br.com.robson.projeto.course.services.ProductServices;
/**
 *
 * @author 99030499
 */

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    
    @Autowired
    private ProductServices service;
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
