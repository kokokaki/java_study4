package day19.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapBasic {

    public static void main(String[] args) {

        //Map: key, value의 쌍으로 데이터를 집합관리
        //   key는 중복불가능, value는 중복가능
        Map<String, Member> memberMap = new HashMap<>();

        //map에 객체 추가 : put(key, value)
        memberMap.put("멍멍이", new Member("김철수", 30));
        memberMap.put("야옹이", new Member("고길동", 45));
        memberMap.put("짹짹이", new Member("박영희", 35));

        System.out.println(memberMap);

        System.out.println(memberMap.size());

        //중복된 key를 설정하면 value가 수정됨
        memberMap.put("야옹이", new Member("둘리", 10));
        System.out.println(memberMap);

        //map에 저장된 객체 참조: get(key)
        Member member = memberMap.get("짹짹이");
        System.out.println(member);

        //map 데이터 삭제: remove(key)
        memberMap.remove("야옹이");
        System.out.println(memberMap);

        //map에 저장된 key 존재 유무 확인: containsKey(obj)
        System.out.println(memberMap.containsKey("야옹이"));
        System.out.println(memberMap.containsKey("짹짹이"));

        System.out.println("========================");

        //map의 반복문 처리
        Set<String> keys = memberMap.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(memberMap.get(key));
        }
    }
}
