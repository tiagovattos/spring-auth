package br.edu.fema.auth.domain.car;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "car")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
