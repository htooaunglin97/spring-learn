/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.commentapp.comment.repos;

import com.hal.commentapp.comment.entities.Comment;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
        System.out.println("Comment stored!!!");
    }
    
}
