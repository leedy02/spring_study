package hello.hellospring.controller;

public class MemberForm {
    //template에서 memberForm으로 받아올 데이터 값 저장하는 클래스
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
