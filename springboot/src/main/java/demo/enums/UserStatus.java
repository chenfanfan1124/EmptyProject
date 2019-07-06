package demo.enums;

import java.util.stream.Stream;

public enum UserStatus {
    //未激活
    NOT_ACTIVE(0),
    // 已激活
    ACTIVED(1),
    // 禁用
    DISABELD(2);

    private int value;

    UserStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static UserStatus valueOf(int value) {
        return Stream.of(values()).filter((e) -> e.getValue() == value).findFirst().orElse(null);
    }
}
