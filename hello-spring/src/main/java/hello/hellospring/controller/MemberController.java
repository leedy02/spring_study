package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/members/new")
    public String createForm(){
        //조회
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        //데이터 보내기
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/";
    }
}
