package generics;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        final Set<Integer> keys = new HashSet<Integer>() {
//            {
//                add(5);
//                add(6);
//                add(6);
//                add(7);
//            }
//        };
//        final Dictionary<Integer, Long> dict = new Dictionary<Integer, Long>(keys, 42L);
//        dict.addKey(16);
//        dict.addKey(46);
//        System.out.println(dict.getValue(16));
        System.out.println(Dictionary.calc(100));
        System.out.println(Dictionary.calc(1_000_000));
    }
}
