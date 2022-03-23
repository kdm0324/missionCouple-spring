package missionCouple.missionCouplespring;

import missionCouple.missionCouplespring.domain.Member;
import missionCouple.missionCouplespring.repository.MemberRepository;
import missionCouple.missionCouplespring.repository.MemoryMemberRepository;
import missionCouple.missionCouplespring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
