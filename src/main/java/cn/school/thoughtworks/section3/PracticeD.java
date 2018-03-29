package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<>();
        collectionA.forEach(s -> {
            String  key = s;
            int value = 1;
            if(s.contains("-")){
                value = Integer.parseInt(s.substring(s.indexOf("-") + 1));
                key = s.substring(0, s.indexOf("-"));
            }
            value += collection3.containsKey(key) ? collection3.get(key) : 0;
            collection3.put(key, value);
        });
        collection3.forEach((k,v) ->{
            if(object.get("value").contains(k)){
                collection3.put(k, v - v/3);
            }
        });
        return collection3;
    }
}
