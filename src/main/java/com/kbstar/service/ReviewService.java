package com.kbstar.service;

import com.kbstar.dto.Review;
import com.kbstar.frame.KBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements KBService<Integer, Review> {
    @Autowired
    com.kbstar.mapper.ReviewMapper mapper;
    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param review
     */
    @Override
    public void register(Review review) throws Exception {
        mapper.insert(review);
    }

    @Override
    public void remove(Integer i) throws Exception {
        mapper.delete(i);

    }

    @Override
    public void modify(Review review) throws Exception {
        mapper.update(review);
    }

    @Override
    public Review get(Integer i) throws Exception {
        return mapper.select(i);
    }

    @Override
    public List<Review> get() throws Exception {
        return mapper.selectall();
    }
}
