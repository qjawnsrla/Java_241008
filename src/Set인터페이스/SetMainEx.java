package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;

public class SetMainEx {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set);        // 중복도 허용안하고 순서도 제멋대로 프린트됨

        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001,"유나"));
        hashSet.add(new Member(1002,"채원"));
        hashSet.add(new Member(1003,"지수"));
        hashSet.add(new Member(1003,"카리나"));
        for (Member e : hashSet) e.showMember();
    }
}

// 오버라이딩을 통해 제거 조거을 만들어준 것
class Member{
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            if (this.id == member.id) return true;
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}