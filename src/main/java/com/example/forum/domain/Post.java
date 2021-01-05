package com.example.forum.domain;

import java.time.LocalDateTime;

public class Post {
    private Integer postId;
    private Integer userId;
    private String postTitle;
    private Integer classifyId;
    private LocalDateTime postingTime;
    private Integer readingNumbers;
    private Integer replyNumbers;
    private User user;
    private Classify classify;

    public Post() {
    }

    public Post(Integer postId, Integer userId, String postTitle, Integer classifyId, LocalDateTime postingTime, Integer readingNumbers, Integer replyNumbers) {
        this.postId = postId;
        this.userId = userId;
        this.postTitle = postTitle;
        this.classifyId = classifyId;
        this.postingTime = postingTime;
        this.readingNumbers = readingNumbers;
        this.replyNumbers = replyNumbers;
    }

    public Post(Integer postId, String postTitle, LocalDateTime postingTime, Integer readingNumbers, Integer replyNumbers, User user, Classify classify) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postingTime = postingTime;
        this.readingNumbers = readingNumbers;
        this.replyNumbers = replyNumbers;
        this.user = user;
        this.classify = classify;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public LocalDateTime getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(LocalDateTime postingTime) {
        this.postingTime = postingTime;
    }

    public Integer getReadingNumbers() {
        return readingNumbers;
    }

    public void setReadingNumbers(Integer readingNumbers) {
        this.readingNumbers = readingNumbers;
    }

    public Integer getReplyNumbers() {
        return replyNumbers;
    }

    public void setReplyNumbers(Integer replyNumbers) {
        this.replyNumbers = replyNumbers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", postTitle='" + postTitle + '\'' +
                ", classifyId=" + classifyId +
                ", postingTime=" + postingTime +
                ", readingNumbers=" + readingNumbers +
                ", replyNumbers=" + replyNumbers +
                ", user=" + user +
                ", classify=" + classify +
                '}';
    }
}
