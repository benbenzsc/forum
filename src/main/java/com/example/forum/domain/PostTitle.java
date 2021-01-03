package com.example.forum.domain;

public class PostTitle {
    private Integer postId;
    private String postTitle;

    public PostTitle() {
    }

    public PostTitle(Integer postId, String postTitle) {
        this.postId = postId;
        this.postTitle = postTitle;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Override
    public String toString() {
        return "PostTitle{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                '}';
    }
}
