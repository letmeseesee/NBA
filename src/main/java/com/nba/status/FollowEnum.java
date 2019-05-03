package com.nba.status;

import lombok.Getter;

import java.util.Objects;

public enum FollowEnum {
    /**
     * 0未开始 1开始 2结束
     */
    NOT_START((byte)0, "NOT_START"),
    SENDING((byte)1, "SENDING"),
    SEND((byte)2, "SEND");


    @Getter
    private Byte code;

    @Getter
    private String description;

    FollowEnum(Byte code, String description) {
        this.code = code;
        this.description = description;
    }

    public static String code2Desc(byte code) {
        for (GameStatusEnum value : GameStatusEnum.values()) {
            if (Objects.equals(value.getCode(), code)) {
                return value.getDescription();
            }
        }
        return null;
    }
}
