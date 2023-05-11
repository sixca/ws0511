package com.kbstar.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Member {
    @Size(min=4, max=10, message = "ID는 최소4개 최대10 입니다.")
    @NotEmpty(message = "ID는 필수 항목 입니다.")
    private int member_id;

    private String email;

    @NotEmpty(message = "NAME는 필수 항목 입니다.")
    private String name;

    @Size(min=5, max=10, message = "ID는 최소5개 최대10 입니다.")
    @NotEmpty(message = "PWD는 필수 항목 입니다.")
    private String password;

    private String tel;
    private String birth;
    private Date regi_date;
    private int valid;
}
