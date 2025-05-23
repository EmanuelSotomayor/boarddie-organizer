package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.exceptions.UserException;
import com.hex4w0rd.boarddie.repositories.UserRepository;
import com.hex4w0rd.boarddie.services.IMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;
    private final IMessageService messageService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByEmail(username)
                .orElseThrow(() -> new UserException(HttpStatus.NOT_FOUND,
                        this.messageService.getProperty("user.not.found")));
    }

}