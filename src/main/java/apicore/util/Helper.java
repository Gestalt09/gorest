package apicore.util;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Helper {
    public static String getRandomStringElementFromArray(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static String generateRandomString(int length) {
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }
}
