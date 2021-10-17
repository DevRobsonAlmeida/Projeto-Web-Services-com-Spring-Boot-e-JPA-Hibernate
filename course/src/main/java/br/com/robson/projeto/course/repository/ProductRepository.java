/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robson.projeto.course.repository;

import br.com.robson.projeto.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 99030499
 */

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
