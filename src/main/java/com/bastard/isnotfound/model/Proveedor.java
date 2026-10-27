package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(
    name = "proveedores",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uq_proveedores_documento",
            columnNames = {"tipo_documento", "numero_documento"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Proveedor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "tipo_documento", nullable = false, length = 2)
    private String tipoDocumento;

    @Column(name = "numero_documento", nullable = false, length = 15)
    private String numeroDocumento;

    @Column(name = "razon_social", nullable = false, length = 255)
    private String razonSocial;

    @Column(name = "correo_electronico", length = 255)
    private String correoElectronico;

    @Column(name = "nombre_comercial", length = 255)
    private String nombreComercial;

    @Column(length = 20)
    private String telefono;

    @Column(nullable = false, length = 50)
    private String pais;

    @Column(length = 255)
    private String direccion;

    @Column(length = 100)
    private String contacto;

    @Column(nullable = false)
    private Boolean estado;
}