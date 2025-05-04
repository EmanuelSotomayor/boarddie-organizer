package com.hex4w0rd.boarddie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "board_columns")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class Column extends PersistentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @jakarta.persistence.Column(name = "COLUMN_ID")
    private UUID id;
    @jakarta.persistence.Column(name = "TITLE", nullable = false)
    private String title;
    @jakarta.persistence.Column(name = "IS_DEFAULT", nullable = false)
    private Boolean defaultColumn;

    @PrePersist
    private void init(){
        this.defaultColumn = Boolean.TRUE;
    }

}