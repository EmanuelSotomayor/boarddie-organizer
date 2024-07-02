package com.hex4w0rd.boarddie.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class PersonDTO implements Serializable {
    private Long id;
    @NotNull
    @NotBlank
    private String firstName;
    private String middleName;
    private String lastName;
    @NotNull
    @NotBlank
    private String firstSurname;
    private String lastSurname;
    @NotNull
    @NotBlank
    private String workspace;
    @NotNull
    @NotBlank
    private String organization;
    private String ubication;
}