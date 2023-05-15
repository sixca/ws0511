package com.kbstar.service;


import com.kbstar.dto.Item;
import com.kbstar.dto.Member;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.ItemMapper;
import com.kbstar.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService implements KBService<Integer, Member> {

    private final MemberMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param member
     */
    @Override
    public void register(Member member) throws Exception {

    }

    @Override
    public void remove(Integer integer) throws Exception {

    }

    @Override
    public void modify(Member member) throws Exception {

    }


    @Override
    public Member get(Integer id) throws Exception {
        return mapper.select(id);
    }

    @Override
    public List<Member> get() throws Exception {
        return mapper.selectall();
    }

}
