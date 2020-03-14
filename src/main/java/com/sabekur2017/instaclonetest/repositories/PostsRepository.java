package com.sabekur2017.instaclonetest.repositories;

import com.sabekur2017.instaclonetest.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PostsRepository extends JpaRepository<Posts,Long> {
    List<Posts> findByUser_userId(Long id);

}
