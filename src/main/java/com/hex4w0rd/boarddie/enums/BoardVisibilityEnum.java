package com.hex4w0rd.boarddie.enums;

import lombok.Getter;

@Getter
public enum BoardVisibilityEnum {

    PUBLIC("PUBLIC", "Public Board for all invited users"),
    PRIVATE("PRIVATE", "Private Board only for the owner"),
    WORKSPACE("WORKSPACE", "Workspace Board only for invited users"),
    ARCHIVED("ARCHIVED", "Archived Board");

    private final String value;
    private final String description;

    BoardVisibilityEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

}