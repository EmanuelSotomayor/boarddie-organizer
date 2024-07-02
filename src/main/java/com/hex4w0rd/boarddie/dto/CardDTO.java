package com.hex4w0rd.boarddie.dto;

import com.hex4w0rd.boarddie.entities.Column;
import com.hex4w0rd.boarddie.enums.CardStatusEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class CardDTO implements Serializable {
    private Long id;
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    @NotBlank
    private String description;
    private Column column;
    @NotNull
    @NotBlank
    private CardStatusEnum status;
    private Set<TagDTO> tags;
    private String createdAt;
    private String startAt;
    private String endAt;
    private Long userIdCreator;
    private List<UserDTO> members;
}
