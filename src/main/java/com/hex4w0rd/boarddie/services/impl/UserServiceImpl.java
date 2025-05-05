package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.dto.UserDTO;
import com.hex4w0rd.boarddie.repositories.UserRepository;
import com.hex4w0rd.boarddie.services.IMessageService;
import com.hex4w0rd.boarddie.services.IUserService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final IMessageService messageService;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUserById(UUID id, UserDTO userDTO) {
        return null;
    }

    @Override
    public Boolean deleteUserById(UUID id) {
        return null;
    }

    @Override
    public UserDTO getUserById(UUID id) {
        return null;
    }

    @Override
    public Page<UserDTO> getAllUsers() {
        return null;
    }
}
