package com.sabekur2017.instaclonetest.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_post")
public class Posts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long postsId;

    @Column(name = "userimage_url")
    private String postsImage;

    @Column(name = "postsText")
    private String postsText;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "createdAt", updatable = false)
    private Date createdAt;

    public Posts() {
    }
    public Posts(long postsId, String postsImage, String postsText, User user, Date createdAt) {
        super();
        this.postsId = postsId;
        this.postsImage = postsImage;
        this.postsText = postsText;
        this.user = user;
        this.createdAt = createdAt;

    }

    public Long getPostsId() {
        return postsId;
    }

    public void setPostsId(Long postsId) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "postsId=" + postsId +
                ", postsImage='" + postsImage + '\'' +
                ", postsText='" + postsText + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                '}';
    }
}
