package List인터페이스;
// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료구조 (인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어 있지 않음
// 데이터를 다루기 위한 다양한 메소드 제공
// List 인터페이스의 구현체인 ArrayList, Vector, Linked List의 사용방법이 동일

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListBasicEx {
    public static void main(String[] args) {

        // List 인터페이스의 참조변수로 ArrayList 생성된 객체를 참조함
        String[] fruitsArr = {"Watermelon", "Peach", "Cherry"};
        // Arrays.asList() 배열을 리스트 변환하는 메소드
        List<String> list = new ArrayList<>(Arrays.asList(fruitsArr));

        System.out.println(list);

        //List<String> list = new ArrayList<>();           // 1 -  1번의 방법이 2번보다 벡터변환에 있어서 유리 (코드를 안바꿔도 됨)
        //ArrayList<String> list2 = new ArrayList<>();     // 2

        // 요소 추가, 리스트 맨뒤에 요소를 추가
        // Heap 영역에는 Apple 이 아닌 Apple의 주소가 들어간다. 데이터가 직접적으로 들어가는게 아닌 참조변수가 저장된다. String은 참조타입이다.
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list);
        System.out.println("과일 목록 : " + list.toString());
        // 리스트 출력, toString() 메소드가 이미 오버라이딩 되어있음
        System.out.println("과일 목록 : " + list);

        // 특정 인덱스에 요소 추가
        list.add(1,"Grape");    // 시간의 복잡도 O(n)
        System.out.println("과일 목록 : " + list);


        List<Integer> list3 = new ArrayList<>();

        // List 는 기본적으로 값을 맨뒤에 넣는다.
        list3.add(200);
        list3.add(500);
        System.out.println(list3);

        // 요소 가져오기 (인덱스 접근)
        System.out.println("과일 요소 : " + list.get(2));

        // 요소 제거하기 (인덱스 접근)
        list.remove(2);
        System.out.println("과일 목록 : " + list);  // Banana 가 지워짐

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + list.size());   // 출력결과 : 6

        // 요소 순회하기
        for(String e : list){
            System.out.print(e + " ");
        }
        System.out.println();

        // 리스트 정렬하기
        list.sort(Comparator.naturalOrder());   // 오름차순 정렬
        System.out.println("과일 목록 : " + list);   // 출력결과 : [Apple, Banana, Cherry, Grape, Orange, Watermelon]
        list.sort(Comparator.reverseOrder());   // 내림차순 정렬
        System.out.println("과일 목록 : " + list);   // 출력결과 : [Watermelon, Orange, Grape, Cherry, Banana, Apple]
        list.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                    return -1;
                }
            }
        });
        System.out.println(list);



    }
}
