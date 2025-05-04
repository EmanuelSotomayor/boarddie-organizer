package com.hex4w0rd.boarddie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@MappedSuperclass
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor(force = true)
public abstract class PersistentEntity {

    @jakarta.persistence.Column(name = "DELETION_TIME")
    private LocalDate deletionTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USUARIO_CREACION_ID", referencedColumnName = "USER_ID")
    private User createdBy;

    @jakarta.persistence.Column(name = "FECHA_CREACION")
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USUARIO_MODIFICACION_ID", referencedColumnName = "USER_ID")
    private User updatedBy;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDate updatedDate;

}
