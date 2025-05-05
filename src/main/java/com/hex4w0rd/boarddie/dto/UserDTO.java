package com.hex4w0rd.boarddie.dto;

import lombok.*;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class UserDTO implements Serializable {

    private Long id;

    private PersonDTO person;

    private String email;

    private String password;

    private List<UUID> rolesIds;

}