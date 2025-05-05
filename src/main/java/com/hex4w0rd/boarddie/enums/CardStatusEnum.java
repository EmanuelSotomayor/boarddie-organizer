package com.hex4w0rd.boarddie.enums;

import lombok.Getter;

@Getter
public enum CardStatusEnum {

    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED"),
    ARCHIVED("ARCHIVED"),
    IN_RECYCLING_BIN("IN_RECYCLING_BIN");

    private final String code;

    CardStatusEnum(String code) {
        this.code = code;
    }

}
