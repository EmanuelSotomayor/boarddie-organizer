package com.hex4w0rd.boarddie.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class UserLoginRequest implements Serializable {
    private String email;
    private String password;
}