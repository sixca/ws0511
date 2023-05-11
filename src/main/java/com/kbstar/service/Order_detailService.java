package com.kbstar.service;

import com.kbstar.dto.Order_detail;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.Order_detailMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Order_detailService implements KBService<Integer, Order_detail> {
    @Autowired
    Order_detailMapper mapper;
    
    /**
     * 등록 및 가입 진행
     * argument: Object
     * return: null
     *
     * @param orderDetail
     */
    @Override
    public void register(Order_detail orderDetail) throws Exception {
        mapper.insert(orderDetail);
    }

    @Override
    public void remove(Integer i) throws Exception {
        mapper.delete(i);
    }

    @Override
    public void modify(Order_detail orderDetail) throws Exception {
        mapper.update(orderDetail);
    }

    @Override
    public Order_detail get(Integer i) throws Exception {
        return mapper.select(i);
    }

    @Override
    public List<Order_detail> get() throws Exception {
        return mapper.selectall();
    }
}
