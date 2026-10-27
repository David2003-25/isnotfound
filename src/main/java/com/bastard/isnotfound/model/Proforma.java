package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "proformas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Proforma extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "numero_correlativo", nullable = false, unique = true, length = 20)
    private String numeroCorrelativo;

    @Column(name = "fecha_proforma", nullable = false)
    private LocalDate fechaProforma;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal subtotal;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal descuento;

    @Column(name = "otros_cargos", nullable = false, precision = 12, scale = 2)
    private BigDecimal otrosCargos;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal igv;

    @Column(name = "importe_total", nullable = false, precision = 12, scale = 2)
    private BigDecimal importeTotal;

    @Column(nullable = false, length = 20)
    private String estado;

    @Column(columnDefinition = "varchar(max)")
    private String observaciones;
}