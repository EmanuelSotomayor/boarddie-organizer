package com.hex4w0rd.boarddie.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class ColumnDTO implements Serializable {
    private Long id;
    @NotNull
    @NotBlank
    private String title;
    private Boolean defaultColumn;
}
