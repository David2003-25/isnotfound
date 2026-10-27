package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unidad_medida_id", nullable = false)
    private UnidadMedida unidadMedida;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "codigo_producto", nullable = false, unique = true, length = 8)
    private String codigoProducto;

    @Column(name = "tipo_afectacion", nullable = false, length = 2)
    private String tipoAfectacion;

    @Column(name = "peso_unitario", nullable = false, precision = 10, scale = 3)
    private BigDecimal pesoUnitario;

    @Column(
        name = "precio_unitario_venta",
        nullable = false,
        precision = 12,
        scale = 4
    )
    private BigDecimal precioUnitarioVenta;

    @Column(nullable = false)
    private Boolean estado;
}