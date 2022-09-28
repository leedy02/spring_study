package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    //�ܺ� ��û�� ���� controller�� ���ؼ�
    private MemberService memberService;
    //@Autowired private MemberService memberService; (DI) �ʵ� ���Թ�� -> �߰��� �ٲܼ� �ִ� ����� ����

    @Autowired
    public MemberController(MemberService memberService) {
        //controller, service ��������ִ� ���� -> Dependency Injection
        //Dependency injection ��� �� �ϳ� 1)������ injection 2) �ʵ� injection 3) setter ����
        this.memberService = memberService;
    }
    //���� ��ȣ�ϴ� ��Ÿ���� �����ÿ� ���õǴ� ��� constructor ���߽� ���ٵ��� ���ƾ��� �Լ� �������� ���ϵ���

    //@Autowired
    //setter injection ��� -> ������ memService ȣ��� public�ϰ� ����Ǿ� �߸� �ٲٸ� ���� �߻��� �� ����
    //public void setMemberService() {
    //    this.memberService = memberService;
    //}
}
