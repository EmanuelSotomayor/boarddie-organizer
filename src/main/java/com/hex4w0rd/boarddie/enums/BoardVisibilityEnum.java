package com.hex4w0rd.boarddie.enums;

import lombok.Getter;

@Getter
public enum BoardVisibilityEnum {

    PUBLIC("PUBLIC", "Public Board for all invited users"),
    PRIVATE("PRIVATE", "Private Board only for the owner"),
    WORKSPACE("WORKSPACE", "Workspace Board only for invited users"),
    ARCHIVED("ARCHIVED", "Archived Board");

    private final String code;
    private final String description;

    private BoardVisibilityEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

}