package com.sabekur2017.instaclonetest.dtos;

import com.sabekur2017.instaclonetest.model.User;

import java.io.Serializable;
import java.util.Date;

public class PostsDto implements Serializable {
    private long postsId;

    private String postsImage;

    private String postsText;

    private User User;

    private Date createdAt;

    public PostsDto() {
    }

    public PostsDto(long postsId, String postsImage, String postsText, com.sabekur2017.instaclonetest.model.User user, Date createdAt) {
        this.postsId = postsId;
        this.postsImage = postsImage;
        this.postsText = postsText;
        User = user;
        this.createdAt = createdAt;
    }

    public long getPostsId() {
        return postsId;
    }

    public void setPostsId(long postsId) {
        this.postsId = postsId;
    }

    public String getPostsImage() {
        return postsImage;
    }

    public void setPostsImage(String postsImage) {
        this.postsImage = postsImage;
    }

    public String getPostsText() {
        return postsText;
    }

    public void setPostsText(String postsText) {
        this.postsText = postsText;
    }

    public com.sabekur2017.instaclonetest.model.User getUser() {
        return User;
    }

    public void setUser(com.sabekur2017.instaclonetest.model.User user) {
        User = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "PostsDto{" +
                "postsId=" + postsId +
                ", postsImage='" + postsImage + '\'' +
                ", postsText='" + postsText + '\'' +
                ", User=" + User +
                ", createdAt=" + createdAt +
                '}';
    }
}
