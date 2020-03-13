package com.sabekur2017.instaclonetest.dtos;

import com.sabekur2017.instaclonetest.enums.Role;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserDto implements Serializable  {
    private Long userId;

    private String userEmail;

    private String userFullName;

    private String username;

    private String password;

    private Role role;

    private String UserImage;

    private LocalDateTime createdAt;

    public UserDto(Long userId, String userEmail, String userFullName, String username, String password, Role role, String userImage, LocalDateTime createdAt) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userFullName = userFullName;
        this.username = username;
        this.password = password;
        this.role = role;
        UserImage = userImage;
        this.createdAt = createdAt;
    }

    public UserDto() {
    }

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
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", UserImage='" + UserImage + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
