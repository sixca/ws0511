package com.kbstar.service;

import com.kbstar.dto.Board;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService implements KBService<Integer, Board> {
    @Autowired
    BoardMapper mapper;
    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param board
     */
    @Override
    public void register(Board board) throws Exception {
        mapper.insert(board);
    }

    @Override
    public void remove(Integer i) throws Exception {
        mapper.delete(i);

    }

    @Override
    public void modify(Board board) throws Exception {
        mapper.update(board);
    }

    @Override
    public Board get(Integer i) throws Exception {
        return mapper.select(i);
    }

    @Override
    public List<Board> get() throws Exception {
        return mapper.selectall();
    }
}
