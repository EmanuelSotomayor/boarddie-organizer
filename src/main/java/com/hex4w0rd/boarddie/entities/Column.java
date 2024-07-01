package com.hex4w0rd.boarddie.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Table(name = "board_columns")
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class Column implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @jakarta.persistence.Column(name = "TITLE", nullable = false)
    private String title;
    @jakarta.persistence.Column(name = "IS_DEFAULT", nullable = false)
    private Boolean defaultColumn;

    @PrePersist
    private void init(){
        this.defaultColumn = Boolean.TRUE;
    }

}