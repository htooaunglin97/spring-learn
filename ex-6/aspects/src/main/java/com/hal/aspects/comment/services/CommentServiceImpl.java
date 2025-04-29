/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.aspects.comment.services;

import com.hal.aspects.comment.entities.Comment;
import com.hal.aspects.customannotations.ToLog;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class CommentServiceImpl implements CommentService{
    
    private static final Logger logger =  Logger.getLogger(CommentServiceImpl.class.getName());

    @Override
    public String sendComment(Comment comment) {
       //do something
       logger.log(Level.INFO, "sending comment: {0}", comment.getText());
       return "SUCCESS";
    }

    @Override
    public void publishComment(Comment comment) {
        logger.log(Level.INFO, "publishing comment: {0}", comment.getText());
    }

    @Override
    @ToLog
    public void deleteComment(Comment comment) {
        logger.log(Level.INFO, "deleting comment: {0}", comment.getText());
    }

    @Override
    @ToLog
    public void editComment(Comment comment) {
       logger.log(Level.INFO, "editing comment: {0}", comment.getText());
    }
    
    
    
}
