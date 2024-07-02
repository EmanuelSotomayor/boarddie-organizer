package com.hex4w0rd.boarddie.dto;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class UserRolWorkspaceDTO implements Serializable {
    private UserDTO user;
    private RoleDTO role;
    private WorkspaceDTO workspace;
}
