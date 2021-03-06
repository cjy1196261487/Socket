package com.tw.socket.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by wei.tian
 * 2019/4/16
 */
public class TimeUtil {
    private TimeUtil() {
        throw new IllegalStateException("No instance!");
    }

    public static int checkDuration(String name, long duration, TimeUnit unit) {
        if (duration < 0) throw new IllegalArgumentException(name + " < 0");
        if (unit == null) throw new NullPointerException("unit == null");
        long millis = unit.toMillis(duration);
        if (millis > Integer.MAX_VALUE) throw new IllegalArgumentException(name + " too large.");
        if (millis == 0 && duration > 0) throw new IllegalArgumentException(name + " too small.");
        return (int) millis;
    }
}
