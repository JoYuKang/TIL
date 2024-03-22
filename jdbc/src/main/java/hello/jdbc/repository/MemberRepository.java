package hello.jdbc.repository;

import hello.jdbc.connection.DBConnectionUtil;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.NoSuchElementException;

/**
 * JDBC - DriverManager 사용
 */
@Slf4j
public class MemberRepository {

    public Member save(Member member) throws SQLException {
        String sql = "Insert into member(member_Id, money) values(?,?)";
        Connection connection = null;
        PreparedStatement psmt = null;

        connection = getConnection();

        try {
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, member.getMemberId());
            psmt.setInt(2, member.getMoney());
            psmt.executeUpdate();
            return member;
        } catch (SQLException e) {
            log.error("DB Error! " , e);
            throw new RuntimeException(e);
        }
        finally {
            close(connection,psmt , null);
        }
    }

    public Member findById(String memberId) throws SQLException {
        String sql = "Select * From Member Where Member_Id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql );
            pstmt.setString(1, memberId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Member member = new Member();
                member.setMemberId(rs.getString("member_id"));
                member.setMoney(rs.getInt("money"));
                return member;
            }else {
                throw new NoSuchElementException("not fund memberId = " + memberId);
            }

        } catch (SQLException e) {
            log.error("error ", e);
            throw e;
        }
        finally {
            close(con, pstmt, rs);
        }

    }

    public void update(String memberId, int money) throws SQLException {
        String sql = "update Member set money=? Where Member_Id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql );
            pstmt.setInt(1, money);
            pstmt.setString(2, memberId);
            int resultSize = pstmt.executeUpdate();
            log.info("member update size = {}", resultSize);
        } catch (SQLException e) {
            log.error("error ", e);
            throw e;
        }
        finally {
            close(con, pstmt, rs);
        }
    }

    public void delete(String memberId) throws SQLException {
        String sql = "delete from Member Where Member_Id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql );
            pstmt.setString(1, memberId);
            int resultSize = pstmt.executeUpdate();
            log.info("member delete size = {}", resultSize);
        } catch (SQLException e) {
            log.error("error ", e);
            throw e;
        }
        finally {
            close(con, pstmt, rs);
        }
    }


    private void close(Connection con, Statement stmt, ResultSet rs) throws SQLException {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                log.info("DB Error " , e);
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                log.info("DB Error " , e);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                log.info("DB Error " , e);
            }
        }


    }

    private static Connection getConnection() {
        return DBConnectionUtil.getConnection();
    }
}
