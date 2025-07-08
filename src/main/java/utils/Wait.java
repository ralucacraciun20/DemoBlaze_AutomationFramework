package utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Wait {

    @SneakyThrows
    public static void waitInSeconds(int seconds) {
        Thread.sleep(seconds * 1000L);
    }
}