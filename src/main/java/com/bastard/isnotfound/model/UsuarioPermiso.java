package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
    name = "usuarios_permisos",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "pk_usuarios_permisos",
            columnNames = {"usuario_id", "permiso_id"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioPermiso extends BaseEntity {

    @EmbeddedId
    private UsuarioPermisoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("permisoId")
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permiso permiso;
}