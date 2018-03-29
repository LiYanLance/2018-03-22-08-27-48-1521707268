package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        collectionA.forEach((key, value) ->{
            if(object.get("value").contains(key)){
                collectionA.put(key, value - value / 3);
            }
        });
        return collectionA;
    }
}
