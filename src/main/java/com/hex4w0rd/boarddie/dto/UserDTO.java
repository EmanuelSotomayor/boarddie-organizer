package com.hex4w0rd.boarddie.dto;

import com.hex4w0rd.boarddie.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class UserDTO implements Serializable {

    private Long id;

    private String email;

    private String password;

    private Set<Role> roles;

}