package com.hex4w0rd.boarddie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "persons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class Person extends PersistentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "PERSON_ID")
    private UUID id;
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