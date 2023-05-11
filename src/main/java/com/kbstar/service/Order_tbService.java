package com.kbstar.service;

import com.kbstar.dto.Order_tb;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.Order_detailMapper;
import com.kbstar.mapper.Order_tbMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class Order_tbService implements KBService<Integer, Order_tb> {
    @Autowired
    Order_tbMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param orderTb
     */
    @Override
    public void register(Order_tb orderTb) throws Exception {
        mapper.insert(orderTb);
    }

    @Override
    public void remove(Integer i) throws Exception {
        mapper.delete(i);
    }

    @Override
    public void modify(Order_tb orderTb) throws Exception {
        mapper.update(orderTb);
    }

    @Override
    public Order_tb get(Integer i) throws Exception {
        return mapper.select(i);
    }

    @Override
    public List<Order_tb> get() throws Exception {
        return mapper.selectall();
    }
}
