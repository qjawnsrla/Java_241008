package HashMap기본;
// Map 인터페이스 : 키(key)와 값(value)의 쌍(pair)로 자료를 관리하는 인터페이스
// 구현체 HashMap, TreeMap, hashTable, Properties

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 생성
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : Entry(키, 값을 합한 것) - 파이썬에서는 item의 개념
        map.put("토마토", 99);
        map.put("파스타", 55);
        map.put("리조토", 95);
        map.put("스테이크", 80);
        map.put("파스타", 96);  // 키가 같기 때문에 저장된 값이 대체됨
        System.out.println("총 Entity 수 : " + map.size());
        System.out.println("Key로 값 찾기 : " + map.get("토마토"));
        System.out.println("Key로 값 찾기 : " + map.get("파스타"));
        System.out.print(map);
        System.out.println();

        // 반복 순회 방법 (향상된 for문을 이용하는 방법)
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key) + " ");
        }
        System.out.println();

        // 이전 방식 순회 : 반복자 (iterator) 를 이용하는 방식
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }

    }
}
