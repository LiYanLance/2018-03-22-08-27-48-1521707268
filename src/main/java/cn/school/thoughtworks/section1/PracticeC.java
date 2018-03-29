package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        return collection1.stream().filter(str -> collection2.get("value").contains(str)).collect(Collectors.toList());
    }
}
