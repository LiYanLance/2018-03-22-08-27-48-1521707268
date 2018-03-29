package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        collection1.forEach(str -> {
            String key = "", strValue = "";
            for (int i = 0; i < str.length(); i++) {
                char tempChar = str.charAt(i);
                if(tempChar >= 'a' && tempChar <= 'z'){
                    key += tempChar;
                } else if (tempChar >= '0' && tempChar <= '9') {
                    strValue += tempChar;
                }
            }
            int value = strValue.equals("") ? 1 : Integer.parseInt(strValue);
            if (!result.containsKey(key)) {
                result.put(key, value);
            } else {
                result.put(key, result.get(key) + value);
            }
        });
        return result;
    }
}
