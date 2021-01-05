package com.example.forum.domain;

import java.time.LocalDateTime;

public class Reply {
    private Integer replyId;
    private Integer postId;
    private Integer replyUserId;
    private Integer userId;
    private String commentText;
    private LocalDateTime commentDatetime;
    private Post post;
    private User replyUser;
    private User user;

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

    public Reply(Integer replyId, String commentText, LocalDateTime commentDatetime, Post post, User replyUser, User user) {
        this.replyId = replyId;
        this.commentText = commentText;
        this.commentDatetime = commentDatetime;
        this.post = post;
        this.replyUser = replyUser;
        this.user = user;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(User replyUser) {
        this.replyUser = replyUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
                ", post=" + post +
                ", replyUser=" + replyUser +
                ", user=" + user +
                '}';
    }
}
