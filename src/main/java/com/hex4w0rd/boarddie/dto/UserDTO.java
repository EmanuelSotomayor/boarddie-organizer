package com.hex4w0rd.boarddie.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Set;

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

    private Set<RoleDTO> roles;

}