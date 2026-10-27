package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "unidades_medida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnidadMedida extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigo_sunat", nullable = false, unique = true, length = 3)
    private String codigoSunat;

    @Column(nullable = false, length = 50)
    private String nombre;
}