package com.kbstar.mapper;

import com.kbstar.dto.Order_detail;
import com.kbstar.frame.KBMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Order_detailMapper extends KBMapper<Integer, Order_detail> {

}
