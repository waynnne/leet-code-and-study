package cn.wayne.solutions.problems;

import java.util.*;

/**
 * Author: Waynnne
 * Date: 2020/6/13 10:49
 * Desc: Frequents
 */

public class Frequents {

    /**
     * 统计列表中出现频率最高的前n个字符串。
     * 如： ["a", "b", "a", "a", "c", "c", "c", "d", "d"]
     * 当：n=1, 输出：a;
     * 当：n=3, 输出：a, c, d
     * @param list 列表
     * @param n 排名
     */
    public static void frequentTopNFromListString(List<String> list, int n) {
        Map<String, Integer> keyCounts = new HashMap<>();
        // 1.统计每个元素出现的频率，先判断再存
        for (String key : list) {
            Integer value = keyCounts.get(key);
            keyCounts.put(key, value == null ? 1 : value + 1);
        }

        // 2.使用entrySet遍历Map，存储到List
        List<Map.Entry<String, Integer>> listEntry = new ArrayList<>(keyCounts.entrySet());

        // 3.重写Comparator接口的compare方法，对List的value进行排序(匿名函数)
        listEntry.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // 按频率统计，所以要降序排序
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(listEntry);

        // 4.判断，如果n大于list，直接返回
        if (n > listEntry.size()) {
            return;
        }

        // 5.输出前n个字符串
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(listEntry.get(i).getKey());
        }
        System.out.println(stringList);
    }

    /**
     * 统计列表中出现频率最高的前n个字符串。
     * 如： ["a", "b", "a", "a", "c", "c", "c", "d", "d"]
     * 当：n=1, 输出：a;
     * 当：n=3, 输出：a, c, d
     * @param list 列表
     * @param n 排名
     */
    public static void frequentTopNFromListString1(List<String> list, int n) {
        Map<String, Integer> keyCounts = new HashMap<>();
        // 1.统计每个元素出现的频率(第二种，使用Collections内置方法)
        for (String key : list) {
            if (!keyCounts.containsKey(key)) {
                keyCounts.put(key, Collections.frequency(list, key));
            }
        }

        // 2.使用entrySet遍历Map，存储到List
        List<Map.Entry<String, Integer>> listEntry = new ArrayList<>(keyCounts.entrySet());

        // 3.重写Comparator接口的compare方法，对List的value进行排序(lambda)
        listEntry.sort((o1, o2) -> {
            // 按频率统计，所以要降序排序
            return o2.getValue().compareTo(o1.getValue());
        });
        System.out.println(listEntry);

        // 4.判断，如果n大于list，直接返回
        if (n > listEntry.size()) {
            return;
        }

        // 5.输出前n个字符串
        //List<Map.Entry<String, Integer>> stringList = listEntry.subList(0, n-1);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(listEntry.get(i).getKey());
        }
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "a", "c", "c", "c", "d", "d");
        frequentTopNFromListString(list, 3);
        frequentTopNFromListString1(list, 3);
    }
}
