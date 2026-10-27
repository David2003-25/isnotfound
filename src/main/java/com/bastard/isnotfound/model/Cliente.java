package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 11)
    private String ruc;

    @Column(name = "razon_social", nullable = false, length = 255)
    private String razonSocial;

    @Column(name = "correo_electronico", length = 255)
    private String correoElectronico;

    @Column(length = 20)
    private String telefono;

    @Column(length = 6)
    private String ubigeo;

    @Column(length = 50)
    private String departamento;

    @Column(length = 50)
    private String provincia;

    @Column(length = 50)
    private String distrito;

    @Column(length = 255)
    private String direccion;

    @Column(nullable = false)
    private Boolean estado;
}