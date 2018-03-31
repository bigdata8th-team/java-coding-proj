package misc;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Misc_07_Pair {
    public static void main(String[] args) {
        Map<Pair<String, String>, Long> countMap = new HashMap<>();
        Pair<String, String> stu1 = new ImmutablePair<>("1", "hank");
        Pair<String, String> stu2 = new ImmutablePair<>("1", "bob");
        Pair<String, String> stu3 = new ImmutablePair<>("1", "james");
        List<Pair<String, String>> countList = new ArrayList<>();
        countList.add(stu1);
        countList.add(stu2);
        countList.add(stu3);
        countList.stream()
                .map(line1 -> new ImmutablePair<String, Integer>(line1.getKey(), 1))
                .filter(line -> line.getKey().equals("1")) // 这里必须用filter过滤出相同的key值
                .reduce((line1, line2) ->
                        new ImmutablePair<String, Integer>(line1.getKey(), line1.getValue() + line2.getValue()))
                .ifPresent(
                        System.out::println
                );
    }
}
