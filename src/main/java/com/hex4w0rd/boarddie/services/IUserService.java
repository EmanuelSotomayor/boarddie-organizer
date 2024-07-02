package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.dto.UserDTO;
import org.springframework.data.domain.Page;

public interface IUserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUserById(Long id, UserDTO userDTO);
    Boolean deleteUserById(Long id);
    UserDTO getUserById(Long id);
    Page<UserDTO> getAllUsers();
}