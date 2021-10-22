package day17.api.lang.obj;

public class Member {

    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected void finalize() throws Throwable {
//        this.name = "시체";
        System.out.println(name + "객체 소멸됨!");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
