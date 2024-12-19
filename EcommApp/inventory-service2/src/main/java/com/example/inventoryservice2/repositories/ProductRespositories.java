package com.example.inventoryservice2.repositories;

import com.example.inventoryservice2.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public interface ProductRespositories extends JpaRepository<Products,String> {

}
