package com.bastard.isnotfound.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductoProveedorId implements Serializable {

    private UUID productoId;

    private UUID proveedorId;
}