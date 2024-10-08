package List인터페이스실습;
// Vector 는 ArrayList 와 동일한 내부구조를 가짐
// 둘의 차이점은 동기화(Synchronized) 된 메소드 구성되어 있어 멀티쓰레드 환경에서 안전하다

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("민지", "minji@gmail.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("하니", "하니@gmail.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("혜린", "혜린@gmail.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("혜인", "혜인@gmail.com", "010-1234-5678", "뉴진스"));
        list.add(new NameCard("다니엘", "다니엘@gmail.com", "010-1234-5678", "뉴진스"));

        for(NameCard e : list){
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.email);
            System.out.println("전화 : " + e.phone);
            System.out.println("직업 : " + e.job);
        }

    }
}

class NameCard {
    String name;
    String email;
    String phone;
    String job;

    public NameCard(String name, String email, String phone, String job) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.job = job;
    }
}
