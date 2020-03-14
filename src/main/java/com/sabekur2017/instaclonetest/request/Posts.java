package com.sabekur2017.instaclonetest.request;

import java.io.Serializable;

public class Posts implements Serializable {
    private String postsImage;

    private String postsText;

    public Posts() {
    }

    public Posts(String postsImage, String postsText) {
        this.postsImage = postsImage;
        this.postsText = postsText;
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

    @Override
    public String toString() {
        return "Posts{" +
                "postsImage='" + postsImage + '\'' +
                ", postsText='" + postsText + '\'' +
                '}';
    }
}
