package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(
    name = "sucursales",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uq_sucursales_codigo",
            columnNames = {"empresa_id", "codigo_establecimiento"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sucursal extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @Column(name = "codigo_establecimiento", nullable = false, length = 4)
    private String codigoEstablecimiento;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String direccion;

    @Column(nullable = false, length = 6)
    private String ubigeo;

    @Column(length = 50)
    private String departamento;

    @Column(length = 50)
    private String provincia;

    @Column(length = 50)
    private String distrito;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100)
    private String email;

    @Column(nullable = false)
    private Boolean estado;
}