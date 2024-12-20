package org.example.collectionprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
//    js
//{
//    국어 : 10,
//    영어 : 20,
//    수학 : 100
//}
public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();

    // js : map[korean] = 100
    map.put("korean", 100);
    map.put("english", 10);

    System.out.println(map);

    map.put("korean", 30);
    System.out.println(map);

    // 조회

    System.out.println(map.get("korean"));

    System.out.println(map.get("math"));

    System.out.println(map.getOrDefault("math", 0));
    System.out.println(map.getOrDefault("korean", 0));

    // 크기
    System.out.println(map.size());

    Set<String> keys = map.keySet();

    for (String key : keys) {
        Integer value = map.get(key);
        System.out.println(key + value);
    }



}

}
