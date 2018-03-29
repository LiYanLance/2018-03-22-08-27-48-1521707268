package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        collection1.forEach(str->{
            String key = str;
            int value = 1;
            if(str.contains("-")){
                value = Integer.parseInt(str.substring(str.indexOf("-") + 1));
                key = str.substring(0, str.indexOf("-"));
            }
            if (!result.containsKey(key)) {
                result.put(key, value);
            } else {
                result.put(key, result.get(key) + value);
            }
        });
        return result;
    }
}
