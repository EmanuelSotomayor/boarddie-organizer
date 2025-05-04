package com.hex4w0rd.boarddie.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoardVisibilityEnum {

    PUBLIC("PUBLIC", "Public Board for all invited users"),
    PRIVATE("PRIVATE", "Private Board only for the owner"),
    WORKSPACE("WORKSPACE", "Workspace Board only for invited users"),
    ARCHIVED("ARCHIVED", "Archived Board");

    private final String code;
    private final String description;

}