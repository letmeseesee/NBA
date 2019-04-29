package com.nba.status;

import lombok.Getter;

import java.util.Objects;

public enum GameStatusEnum {
    /**
     * 1未开始 2开始 3结束
     */
    NOT_START((byte) 1, "Scheduled"),
    STARTING((byte) 2, "InProgress"),
    CLOSE((byte) 3, "Final"),
    FOT((byte) 4, "F/OT"),
    Suspended((byte) 5, "Suspended"),
    Postponed((byte) 6, "Postponed"),
    Canceled((byte) 7, "Canceled");

    @Getter
    private Byte code;

    @Getter
    private String description;

    GameStatusEnum(Byte code, String description) {
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
