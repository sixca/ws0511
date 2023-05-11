package com.kbstar.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Order_detail {
    private int detail_id;
    private int item_id;
    private int order_id;
    private int cnt;
}
