package com.sparta.shop.controller;

import com.sparta.shop.dto.request.PostRequestDto;
import com.sparta.shop.dto.response.PostResponseDto;
import com.sparta.shop.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts/{id}")
    public PostResponseDto getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @GetMapping("/posts")
    public List<PostResponseDto> getAllPost(){
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    public PostResponseDto createPost(@RequestBody PostRequestDto postRequestDto){
        return postService.createPost(postRequestDto);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePostById(@PathVariable Long id){
        postService.deletePostById(id);
    }

    @PutMapping("/posts/{id}")
    public long updatePostById(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        return postService.updatePostById(id, requestDto);
    }

}
