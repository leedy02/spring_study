package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService((MemoryMemberRepository) memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    //���� spring bean ����ϴ� ���

    //��Ȳ�� ���� ���� Ŭ���� ����?
    //memory Member Repository�� ���߿� DB ������ ������ �� ���� �ڵ� �������� �ʰ� �ٲ�ġ�� �Ϸ��� ��
    //Component Scan�� �ַ� ����ȭ�� ��Ʈ�ѷ�, ����, �������丮 ���� �ڵ�, BEAN�� ����ȭ���� �ʰų� ��Ȳ�� ���� ���� Ŭ������ �����ؾ��ϴ� ���
    //Spring container�� �ö󰡴� �͵鸸 autowired�� ������ (BEAN���� ����ϰų�, Component Scan ��� ���)
}
