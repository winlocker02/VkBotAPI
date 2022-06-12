package ru.winlocker.vkbotapi.utils;

import java.util.concurrent.*;

public class CodeGenerator {

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();
    private static final char[] CHARS_ARRAY = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789".toCharArray();

    public static String generateCode(int size) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < size; index++) {
            stringBuilder.append(CHARS_ARRAY[RANDOM.nextInt(0, CHARS_ARRAY.length)]);
        }

        return stringBuilder.toString();
    }
}
