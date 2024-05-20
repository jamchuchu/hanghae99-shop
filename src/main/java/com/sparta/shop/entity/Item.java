package com.sparta.shop.entity;

import com.sparta.shop.dto.request.PostRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@NoArgsConstructor
@Getter @Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "contents", nullable = false)
    private String contents;
    @Column(name= "price", nullable = false)
    private Long price;
    @Column(name="username", nullable = false, unique = true)
    private String userName;

    public Item(PostRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.contents =requestDto.getContents();
        this.price = requestDto.getPrice();
        this.userName = requestDto.getUsername();
    }



}
