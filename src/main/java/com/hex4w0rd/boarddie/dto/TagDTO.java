package com.hex4w0rd.boarddie.dto;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class TagDTO implements Serializable {
    private Long id;
    private String title;
    private String colour;
}