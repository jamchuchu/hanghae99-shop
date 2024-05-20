package com.sparta.shop.service;

import com.sparta.shop.dto.request.PostRequestDto;
import com.sparta.shop.dto.response.PostResponseDto;
import com.sparta.shop.entity.Item;
import com.sparta.shop.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public PostResponseDto getPostById(Long id) {
        return new PostResponseDto(postRepository.findById(id).orElseThrow());
    }

    public List<PostResponseDto> getAllPosts() {
        return postRepository.findAll().stream().map(PostResponseDto::new).toList();
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    public Long updatePostById(Long id, PostRequestDto requestDto) {
        return (long)postRepository.updateItemById(id, requestDto.getTitle(), requestDto.getContents(), requestDto.getPrice(), requestDto.getUsername());

    }

    public PostResponseDto createPost(PostRequestDto requestDto) {
        Item item = new Item(requestDto);
        return new PostResponseDto(postRepository.save(item));
    }
}
