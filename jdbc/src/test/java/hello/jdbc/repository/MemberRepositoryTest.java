package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@Slf4j

class MemberRepositoryTest {

    MemberRepository repository = new MemberRepository();
    @Test
    void crud() throws SQLException {
        // save
        Member member = new Member("memberVo6", 10000);
        repository.save(member);

        // findm
        Member findMember = repository.findById(member.getMemberId());
        log.info("findMember ={}", findMember);
        assertThat(findMember).isEqualTo(member);

        // update
        repository.update(findMember.getMemberId(), 20000);
        Member updateeMember = repository.findById(findMember.getMemberId());
        assertThat(updateeMember.getMoney()).isEqualTo(20000);

        // delete
        repository.delete(member.getMemberId());
        assertThatThrownBy(() -> repository.findById(member.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);
    }

}