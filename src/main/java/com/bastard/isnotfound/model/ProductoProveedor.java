package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
    name = "productos_proveedores"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoProveedor extends BaseEntity {

    @EmbeddedId
    private ProductoProveedorId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productoId")
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("proveedorId")
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;
}