package com.hex4w0rd.boarddie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Table(name = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;
    @Column(name = "MIDDLE_NAME", nullable = false)
    private String middleName;
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "FIRST_SURNAME", nullable = false)
    private String firstSurname;
    @Column(name = "LAST_SURNAME", nullable = false)
    private String lastSurname;
    @Column(name = "WORKSPACE", nullable = false)
    private String workspace;
    @Column(name = "ORGANIZATION", nullable = false)
    private String organization;
    @Column(name = "UBICATION", nullable = false)
    private String ubication;

}