package missionCouple.missionCouplespring.repository;

import missionCouple.missionCouplespring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id);
    Optional<Member> findByName(String Name);
    List<Member> findAll();
}
