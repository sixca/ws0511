package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Review {
    private int review_id;
    private int member_id;
    private int item_id;
    private int type;
    private String title;
    private Date rdate;
    private Date udate;
    private String content;
}
