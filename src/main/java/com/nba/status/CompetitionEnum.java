package com.nba.status;

import lombok.Getter;

import java.util.Objects;

public enum CompetitionEnum {
    /**
     * 1未开始 2开始 3结束 4取消
     */
    NOT_START((byte)1, "Scheduled"),
    STARTING((byte)2, "InProgress"),
    CLOSE((byte)3, "Final"),
    CANCELED((byte)4, "Canceled");


    @Getter
    private Byte code;

    @Getter
    private String description;

    CompetitionEnum(Byte code, String description) {
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
