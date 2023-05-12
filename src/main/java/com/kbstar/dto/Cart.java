package com.kbstar.dto;

import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
    private int id;
    private String userId;
    private String itemId;
    private int cnt;
    private LocalDateTime rdate;
}
