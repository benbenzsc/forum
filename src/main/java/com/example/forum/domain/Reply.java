package com.example.forum.domain;

import java.time.LocalDateTime;

public class Reply {
    private Integer replyId;
    private Integer postId;
    private Integer replyUserId;
    private Integer userId;
    private String commentText;
    private LocalDateTime commentDatetime;
    private PostTitle postTitle;
    private UserLogin replyUserLogin;
    private UserLogin userLogin;

    public Reply() {
    }

    public Reply(Integer replyId, Integer postId, Integer replyUserId, Integer userId, String commentText, LocalDateTime commentDatetime) {
        this.replyId = replyId;
        this.postId = postId;
        this.replyUserId = replyUserId;
        this.userId = userId;
        this.commentText = commentText;
        this.commentDatetime = commentDatetime;
    }

    public Reply(Integer replyId, String commentText, LocalDateTime commentDatetime, PostTitle postTitle, UserLogin replyUserLogin, UserLogin userLogin) {
        this.replyId = replyId;
        this.commentText = commentText;
        this.commentDatetime = commentDatetime;
        this.postTitle = postTitle;
        this.replyUserLogin = replyUserLogin;
        this.userLogin = userLogin;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getCommentDatetime() {
        return commentDatetime;
    }

    public void setCommentDatetime(LocalDateTime commentDatetime) {
        this.commentDatetime = commentDatetime;
    }

    public PostTitle getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(PostTitle postTitle) {
        this.postTitle = postTitle;
    }

    public UserLogin getReplyUserLogin() {
        return replyUserLogin;
    }

    public void setReplyUserLogin(UserLogin replyUserLogin) {
        this.replyUserLogin = replyUserLogin;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", postId=" + postId +
                ", replyUserId=" + replyUserId +
                ", userId=" + userId +
                ", commentText='" + commentText + '\'' +
                ", commentDatetime=" + commentDatetime +
                ", postTitle=" + postTitle +
                ", replyUserLogin=" + replyUserLogin +
                ", userLogin=" + userLogin +
                '}';
    }
}
