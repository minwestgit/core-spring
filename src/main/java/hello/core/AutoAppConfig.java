package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        basePackages = "hello.core", // 탐색할 패키지의 시작 위치 지정
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)) // TestConfig 같은 것들도 빈으로 등록되기 때문에 필터 처리한 것.
public class AutoAppConfig {
    /*
    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */
}