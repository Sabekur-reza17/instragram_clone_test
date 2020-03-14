package com.sabekur2017.instaclonetest.service;

import com.sabekur2017.instaclonetest.dtos.PostsDto;
import com.sabekur2017.instaclonetest.model.Posts;
import com.sabekur2017.instaclonetest.repositories.PostsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {
    @Autowired
    private PostsRepository postsRepository;

    public void addPosts(PostsDto p) {

        var postsEntity = new Posts();

        BeanUtils.copyProperties(p, postsEntity);

        postsRepository.save(postsEntity);
    }

    public List<Posts> getAllPost(){

        return postsRepository.findAll();

    }

    public List<Posts> getPostsById(Long id){

        return postsRepository.findByUser_userId(id);
    }
}
