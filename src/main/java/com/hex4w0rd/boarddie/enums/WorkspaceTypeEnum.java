package com.hex4w0rd.boarddie.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WorkspaceTypeEnum {
<<<<<<< Updated upstream
    DEFAULT,
    IT_ENGINEERING,
    LITTLE_ENTERPRISE,
    MIDDLE_ENTERPRISE,
    BIG_ENTERPRISE,
    ARCHITECTURE,
    MARKETING,
    CRM,
    OPERATIONS,
    HUMAN_RESOURCES,
    EDUCATION,
    OTHER
=======

    IT_ENGINEERING("IT_ENGINEERING"),
    LITTLE_ENTERPRISE("LITTLE_ENTERPRISE"),
    MIDDLE_ENTERPRISE("MIDDLE_ENTERPRISE"),
    BIG_ENTERPRISE("BIG_ENTERPRISE"),
    ARCHITECTURE("ARCHITECTURE"),
    MARKETING("MARKETING"),
    CRM("CRM"),
    OPERATIONS("OPERATIONS"),
    HUMAN_RESOURCES("HUMAN_RESOURCES"),
    EDUCATION("EDUCATION"),
    OTHER("OTHER");

    private final String code;

>>>>>>> Stashed changes
}