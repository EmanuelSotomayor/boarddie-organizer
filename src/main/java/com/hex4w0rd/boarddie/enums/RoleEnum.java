package com.hex4w0rd.boarddie.enums;

import lombok.Getter;

@Getter
public enum RoleEnum {

    VISITOR("VISITOR", "View-only user"),
    OBSERVATOR("OBSERVATOR", "Observer user who can see the entire board"),
    BOARD_MEMBER("BOARD_MEMBER", "Board member"),
    BOARD_OWNER("BOARD_OWNER", "Board owner"),
    BOARD_MODERATOR("BOARD_MODERATOR", "Board moderator"),
    WORKSPACE_MEMBER("WORKSPACE_MEMBER", "Workspace member"),
    WORKSPACE_OWNER("WORKSPACE_OWNER", "Workspace owner"),
    WORKSPACE_MODERATOR("WORKSPACE_MODERATOR", "Workspace moderator");

    private final String code;
    private final String description;

    RoleEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

}