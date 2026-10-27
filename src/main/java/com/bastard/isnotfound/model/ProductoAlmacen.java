package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(
    name = "productos_almacenes",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uq_almacen_producto",
            columnNames = {"almacen_id", "producto_id"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoAlmacen extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "almacen_id", nullable = false)
    private Almacen almacen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @Column(name = "stock_fisico", nullable = false)
    private Integer stockFisico;

    @Column(name = "stock_reservado", nullable = false)
    private Integer stockReservado;

    @Column(name = "stock_minimo", nullable = false)
    private Integer stockMinimo;
}