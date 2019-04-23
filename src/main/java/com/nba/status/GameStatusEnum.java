package com.nba.status;

import lombok.Getter;

import java.util.Objects;

public enum GameStatusEnum {
    /**
     * 1未开始 2开始 3结束
     */
    NOT_START((byte) 1, "未开始"),
    STARTING((byte) 2, "开始"),
    CLOSE((byte) 3, "结束");

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
