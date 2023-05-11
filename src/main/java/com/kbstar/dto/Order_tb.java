package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Order_tb {
    private int order_id;
    private int member_id;
    private int item_id;
    private int price;
    private Date rdate;
    private int valid;
}
