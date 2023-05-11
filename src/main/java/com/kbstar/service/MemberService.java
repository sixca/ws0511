package com.kbstar.service;


import com.kbstar.dto.Member;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class MemberService implements KBService<String, Member> {

    @Autowired
    MemberMapper mapper;
    @Override
    public void register(Member member) throws Exception {
        mapper.insert(member);
        //mapper.insert(cust);
        log.info("Send Mail .........."+ member.getMember_id());
    }

    @Override
    public void remove(String s) throws Exception {
        mapper.delete(s);
    }

    @Override
    public void modify(Member member) throws Exception {
        mapper.update(member);
    }

    @Override
    public Member get(String s) throws Exception {
        return mapper.select(s);
    }
    @Override
    public List<Member> get() throws Exception {
        return mapper.selectall();
    }


}
