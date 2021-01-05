package com.example.forum.domain;

public class PostContent {
    private Integer postContentId;
    private Integer postId;
    private String postContent;
    private Post post;

    public PostContent() {
    }

    public PostContent(Integer postContentId, Integer postId, String postContent) {
        this.postContentId = postContentId;
        this.postId = postId;
        this.postContent = postContent;
    }

    public PostContent(Integer postContentId, String postContent, Post post) {
        this.postContentId = postContentId;
        this.postContent = postContent;
        this.post = post;
    }

    public Integer getPostContentId() {
        return postContentId;
    }

    public void setPostContentId(Integer postContentId) {
        this.postContentId = postContentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostContent{" +
                "postContentId=" + postContentId +
                ", postId=" + postId +
                ", postContent='" + postContent + '\'' +
                ", post=" + post +
                '}';
    }
}
