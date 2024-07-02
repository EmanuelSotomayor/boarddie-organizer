package com.hex4w0rd.boarddie.request;

import com.hex4w0rd.boarddie.enums.BoardVisibilityEnum;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
@EqualsAndHashCode
@ToString
public class BoardUpdateRequest implements Serializable {
    private String title;
    private BoardVisibilityEnum visibility;
    private Boolean favorite;
}