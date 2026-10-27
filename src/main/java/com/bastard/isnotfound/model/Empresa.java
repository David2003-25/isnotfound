package com.bastard.isnotfound.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "empresas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empresa extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 11)
    private String ruc;

    @Column(name = "razon_social", nullable = false, length = 255)
    private String razonSocial;

    @Column(name = "nombre_comercial", length = 255)
    private String nombreComercial;

    @Column(name = "direccion_fiscal", nullable = false, length = 255)
    private String direccionFiscal;

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

    @Column(length = 255)
    private String logo;

    @Column(nullable = false, length = 10)
    private String ambiente;

    @Column(name = "certificado_path", length = 255)
    private String certificadoPath;

    @Column(name = "certificado_password", length = 255)
    private String certificadoPassword;

    @Column(name = "certificado_vencimiento")
    private LocalDate certificadoVencimiento;

    @Column(name = "sol_usuario", length = 255)
    private String solUsuario;

    @Column(name = "sol_clave", length = 255)
    private String solClave;

    @Column(name = "gre_client_id", length = 255)
    private String greClientId;

    @Column(name = "gre_client_secret", length = 255)
    private String greClientSecret;

    @Column(nullable = false)
    private Boolean estado;
}