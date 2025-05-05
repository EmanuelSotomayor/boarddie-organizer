package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.dto.UserDTO;
import java.util.UUID;
import org.springframework.data.domain.Page;

public interface IUserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUserById(UUID id, UserDTO userDTO);
    Boolean deleteUserById(UUID id);
    UserDTO getUserById(UUID id);
    Page<UserDTO> getAllUsers();
}