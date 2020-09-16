package Collect;

import java.util.*;

public class Reverse<K, V> {

    public Map<V, ? extends Collection<K>> reverseMap(Map<K, V> map) {
        Map<V, List<K>> newMap = new HashMap<>();
        map.forEach((key, value) -> {
            if (!newMap.containsKey(value)) {
                newMap.put(value, new LinkedList<>());
            }
            newMap.get(value).add(key);
        });

        return newMap;
    }
}
