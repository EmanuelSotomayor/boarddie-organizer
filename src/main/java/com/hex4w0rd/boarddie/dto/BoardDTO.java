package com.hex4w0rd.boarddie.dto;

import com.hex4w0rd.boarddie.enums.BoardVisibilityEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class BoardDTO implements Serializable {
    private Long id;
    @NotNull
    @NotBlank
    private String title;
    private WorkspaceDTO workspace;
    private List<ColumnDTO> columns;
    @NotNull
    @NotBlank
    private BoardVisibilityEnum visibility;
    private Boolean favorite;
}