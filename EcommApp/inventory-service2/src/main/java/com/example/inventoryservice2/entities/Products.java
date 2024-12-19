package com.example.inventoryservice2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @Data
public class Products {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
