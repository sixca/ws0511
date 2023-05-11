package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Board {
    private int id;
    private String cust_id;
    private String content;
    private int cnt;
    private Date rdate;
}
