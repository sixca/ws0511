package com.kbstar.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Review {
    private int id;
    private int userId;
    private int itemId;
    private String title;
    private String review;
    private int rate;
}
