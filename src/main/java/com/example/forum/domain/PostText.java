package com.example.forum.domain;

import java.time.LocalDateTime;

public class PostText {
    private Integer postId;
    private String postText;
    private LocalDateTime postDatetime;
    private PostTitle postTitle;

    public PostText() {
    }

    public PostText(Integer postId, String postText, LocalDateTime postDatetime) {
        this.postId = postId;
        this.postText = postText;
        this.postDatetime = postDatetime;
    }

    public PostText(String postText, LocalDateTime postDatetime, PostTitle postTitle) {
        this.postText = postText;
        this.postDatetime = postDatetime;
        this.postTitle = postTitle;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public LocalDateTime getPostDatetime() {
        return postDatetime;
    }

    public void setPostDatetime(LocalDateTime postDatetime) {
        this.postDatetime = postDatetime;
    }

    public PostTitle getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(PostTitle postTitle) {
        this.postTitle = postTitle;
    }

    @Override
    public String toString() {
        return "PostText{" +
                "postId=" + postId +
                ", postText='" + postText + '\'' +
                ", postDatetime=" + postDatetime +
                ", postTitle=" + postTitle +
                '}';
    }
}
