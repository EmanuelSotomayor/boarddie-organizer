package com.hex4w0rd.boarddie.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class UserTokenResponse implements Serializable {
    private LocalDate generatedAt;
    private String token;
}