package com.sabekur2017.instaclonetest.model;

import com.sabekur2017.instaclonetest.enums.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long userId;

    @Column(name = "useremail")
    private String userEmail;

    @Column(name = "userfullname")
    private String userFullName;

    @Column(name = "username")
    private String username;
    @Column(name = "password", length = 512)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Column(name = "userimage_url")
    private String userImage;

    @Column(name = "createdAt", updatable = false)
    private LocalDateTime createdAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User() {
    }
    public User(Long userId, String userEmail, String userFullName, String username, String password, Role role,
                String userImage, LocalDateTime createdAt) {
        super();
        this.userId = userId;
        this.userEmail = userEmail;
        this.userFullName = userFullName;
        this.username = username;
        this.password = password;
        this.role = role;
        this.userImage = userImage;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", userImage='" + userImage + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
