package apicore.util;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {

    public static String readJsonFileAsString(String filePath)throws Exception {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
