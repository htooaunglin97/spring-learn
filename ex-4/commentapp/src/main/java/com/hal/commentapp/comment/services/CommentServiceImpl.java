/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.commentapp.comment.services;

import com.hal.commentapp.comment.entities.Comment;
import com.hal.commentapp.comment.proxies.CommentNotificationProxy;
import com.hal.commentapp.comment.repos.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class CommentServiceImpl implements CommentService{
    
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    
    @Autowired
    public CommentServiceImpl(
            CommentRepository commentRepository,
            @Qualifier("comment-push-noti")CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    @Override
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    
}
