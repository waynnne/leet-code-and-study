package cn.wayne.solutions.basic.map;

import java.util.*;

/**
 * Author: Waynnne
 * Date: 2020/6/12 18:47
 * Desc: MapUtil
 */

public class MapUtil {

    /**
     * 使用Set<String> 遍历 Map
     * 遍历key, 然后根据key获取value
     * @param map 待遍历map
     */
    public static void traversalMapWithKeySet(Map<String, Object> map) {
        System.out.println("使用Set<String>遍历Map:");
        for (String key : map.keySet()) {
            System.out.println("key = " + key + ", value = " + map.get(key));
        }
    }

    /**
     * 使用map.values 遍历 Map
     * 只能遍历value
     * @param map 待遍历map
     */
    public static void traversalMapWithValues(Map<String, Object> map) {
        System.out.println("使用map.values遍历Map的value:");
        for (Object value : map.values()) {
            System.out.println("value = " + value);
        }
    }

    /**
     * 使用Set<Map.Entry<String, Object>> 遍历 Map
     * 遍历key，value
     * @param map 待遍历map
     */
    public static void traversalMapWithEntry(Map<String, Object> map) {
        System.out.println("使用Set<Map.Entry<String, Object>>遍历Map:");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    /**
     * 使用Iterator<Map.Entry<String, Object>> 遍历 Map
     * 遍历key，value
     * @param map 待遍历map
     */
    public static void traversalMapWithIteratorEntry(Map<String, Object> map) {
        System.out.println("使用Iterator<Map.Entry<String, Object>>遍历Map:");
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    /**
     * 使用foreach结合Java8 lambda表达式遍历
     * @param map 待遍历map
     */
    public static void traversalMapWithLambda(Map<String, Object> map) {
        System.out.println("使用foreach结合Java8 lambda表达式遍历Map:");
        map.forEach((key, value) -> {
            System.out.println("key = " + key + ", value = " + value);
        });
    }





    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//        map.put("d", 4);
//
//        traversalMapWithKeySet(map);
//        traversalMapWithValues(map);
//        traversalMapWithEntry(map);
//        traversalMapWithIteratorEntry(map);
//        traversalMapWithLambda(map);


    }
}
