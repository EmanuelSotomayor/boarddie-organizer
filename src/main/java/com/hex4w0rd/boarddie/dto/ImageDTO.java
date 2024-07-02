package com.hex4w0rd.boarddie.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class ImageDTO implements Serializable {
    private Long id;
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    private BigInteger size;
    @NotNull
    private byte[] hash;
}
