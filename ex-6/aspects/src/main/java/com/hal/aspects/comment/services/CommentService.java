/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.aspects.comment.services;

import com.hal.aspects.comment.entities.Comment;

/**
 *
 * @author HP
 */
public interface CommentService {
    String sendComment(Comment comment);
    void publishComment(Comment comment);
    void deleteComment(Comment comment);
    void editComment(Comment comment);
}
