package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<>();
        collectionA.stream().distinct().collect(Collectors.toList()).forEach(s -> collection3.put(s, 0));
        collectionA.forEach(s -> collection3.put(s, collection3.get(s) + 1));
        collection3.forEach((key, value)->{
            if (object.get("value").contains(key)) {
                collection3.put(key, value - value / 3);
            }
        });
        return collection3;
    }
}
