package com.kbstar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {
    private int id;
    private String memberId;
    private String name;
    private String password;
    private LocalDateTime date;
    private int valid;

}
