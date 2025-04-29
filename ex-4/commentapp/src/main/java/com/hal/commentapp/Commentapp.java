/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hal.commentapp;

import com.hal.commentapp.comment.entities.Comment;
import com.hal.commentapp.comment.proxies.EmailCommentNotificationProxy;
import com.hal.commentapp.comment.repos.DBCommentRepository;
import com.hal.commentapp.comment.services.CommentService;
import com.hal.commentapp.comment.services.CommentServiceImpl;
import com.hal.commentapp.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author HP
 */
public class Commentapp {

    public static void main(String[] args) {
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();

          var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        var commentService = context.getBean(CommentService.class);
        var comment = new Comment("Laura", "This is a comment");
        commentService.publishComment(comment);
    }
}
