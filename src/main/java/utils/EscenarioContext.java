package utils;

import java.util.HashMap;
import java.util.Map;

public class EscenarioContext {
    private static final Map<String, Object> context = new HashMap<>();

    public static void set(String key, Object value) {
        context.put(key, value);
    }

    public static Object get(String key) {
        return context.get(key);
    }

    public static void clear() {
        context.clear();
    }
}
