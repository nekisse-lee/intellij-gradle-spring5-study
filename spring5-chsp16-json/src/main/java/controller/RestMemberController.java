package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.Member;
import spring.MemberDao;
import spring.MemberRegisterService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class RestMemberController {

    private MemberDao memberDao;
    private MemberRegisterService registerService;

    @GetMapping("/api/members")
    public List<Member> members() {
        return memberDao.selectAll();
    }

/*
    @GetMapping("/api/members/{id}")
    public Member member(@PathVariable Long id, HttpServletResponse response) throws IOException {
        Member member = memberDao.selectById(id);
        if (member == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return member;
    }
*/


    @GetMapping("/api/members/{id}")
    public ResponseEntity<Object> member(@PathVariable Long id)
            throws IOException {
        Member member = memberDao.selectById(id);
        if (member == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ErrorResponse("No member"));
        }
        return ResponseEntity.status(HttpStatus.OK).body(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setRegisterService(MemberRegisterService registerService) {
        this.registerService = registerService;
    }
}
