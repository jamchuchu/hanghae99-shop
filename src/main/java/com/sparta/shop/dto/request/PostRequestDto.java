package com.sparta.shop.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostRequestDto {
    private String title;
    private String contents;
    private Long price;
    private String username;

}
