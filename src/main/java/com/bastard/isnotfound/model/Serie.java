package com.bastard.isnotfound.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(
    name = "series",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uq_series",
            columnNames = {"sucursal_id", "tipo_documento", "serie"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Serie extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sucursal_id", nullable = false)
    private Sucursal sucursal;

    @Column(name = "tipo_documento", nullable = false, length = 2)
    private String tipoDocumento;

    @Column(nullable = false, length = 4)
    private String serie;

    @Column(name = "ultimo_correlativo", nullable = false)
    private Integer ultimoCorrelativo = 0;

    @Column(nullable = false)
    private Boolean estado;
}