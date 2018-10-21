package com.nekisse.spring;

import java.time.LocalDateTime;

public class MemberRegisterService {
    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) {
        Member member = memberDao.selectByEmail(req.getEamil());
        if (member != null) {
            throw new DuplicateMemberException("dup email " + req.getEamil());
        }

        Member newMember = new Member(
                req.getEamil(), req.getPassword(), req.getName(),
                LocalDateTime.now()
        );
        memberDao.insert(newMember);
        return newMember.getId();

    }
}
