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

    //직접 spring bean 등록하는 방법

    //상황에 따라 구현 클래스 변경?
    //memory Member Repository를 나중에 DB 실제로 연결할 때 기존 코드 변경하지 않고 바꿔치기 하려고 함
    //Component Scan은 주로 정형화된 컨트롤러, 서비스, 리포지토리 같은 코드, BEAN은 정형화되지 않거나 상황에 따라 구현 클래스를 변경해야하는 경우
    //Spring container에 올라가는 것들만 autowired가 동작함 (BEAN으로 등록하거나, Component Scan 방식 사용)
}
