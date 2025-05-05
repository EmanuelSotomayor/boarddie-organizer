package com.hex4w0rd.boarddie.enums;

import lombok.Getter;

@Getter
public enum WorkspaceTypeEnum {

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

    WorkspaceTypeEnum(String code) {
        this.code = code;
    }

}