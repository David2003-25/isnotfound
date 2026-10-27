package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

    @Column(nullable = false, unique = true, length = 25)
    private String username;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false, unique = true, length = 255)
    private String correo;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private Boolean estado;

    @Column(name = "ultimo_acceso")
    private LocalDateTime ultimoAcceso;
}