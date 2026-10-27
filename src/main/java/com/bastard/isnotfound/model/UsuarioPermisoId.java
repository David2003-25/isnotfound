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
public class UsuarioPermisoId implements Serializable {

    private UUID usuarioId;

    private UUID permisoId;
}