package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    //외부 요청을 받음 controller를 통해서
    private MemberService memberService;
    //@Autowired private MemberService memberService; (DI) 필드 주입방식 -> 중간에 바꿀수 있는 방법이 없음

    @Autowired
    public MemberController(MemberService memberService) {
        //controller, service 연결시켜주는 과정 -> Dependency Injection
        //Dependency injection 방법 중 하나 1)생성자 injection 2) 필드 injection 3) setter 주입
        this.memberService = memberService;
    }
    //요즘 선호하는 스타일은 생성시에 세팅되는 방식 constructor 개발시 접근되지 말아야할 함수 접근하지 못하도록

    //@Autowired
    //setter injection 방식 -> 누군가 memService 호출시 public하게 노출되어 잘못 바꾸면 문제 발생할 수 있음
    //public void setMemberService() {
    //    this.memberService = memberService;
    //}
}
