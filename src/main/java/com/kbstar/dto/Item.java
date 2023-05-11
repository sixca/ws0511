package com.kbstar.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private int item_id;
    private String item_name;
    private String img;
    private String content;
    private int price;
    private Date rdate;
    private Date udate;

//    private MultipartFile img;
//
//    public Item(int id, String name, int price, String imgname, Date rdate) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.imgname = imgname;
//        this.rdate = rdate;
//    }
}
