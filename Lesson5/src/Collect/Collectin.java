package Collect;

import java.util.HashMap;
import java.util.Map;

public class Collectin {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "3");
        map.put("three", "3");
        map.put("threee", "3");

        Reverse<String, String> reverse = new Reverse<>();
        reverse.reverseMap(map);

        reverse.reverseMap(map).
                forEach((key, value) ->
                        System.out.println(key + " " + value));

    }
}
