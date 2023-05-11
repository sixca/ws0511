package com.kbstar.mapper;

import com.kbstar.dto.Order_tb;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Order_tbMapper extends KBMapper<Integer, Order_tb> {

}
