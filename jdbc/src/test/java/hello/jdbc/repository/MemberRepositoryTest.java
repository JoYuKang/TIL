package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository repository = new MemberRepository();
    @Test
    void crud() throws SQLException {
        Member member = new Member("memberVo1", 10000);
        repository.save(member);
    }
}