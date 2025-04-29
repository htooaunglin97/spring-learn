/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hal.commentapp.comment.repos;

import com.hal.commentapp.comment.entities.Comment;

/**
 *
 * @author HP
 */
public interface CommentRepository {
    void storeComment(Comment comment);
}
