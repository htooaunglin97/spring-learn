/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hal.aspects;

import com.hal.aspects.comment.entities.Comment;
import com.hal.aspects.comment.services.CommentService;
import com.hal.aspects.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author HP
 */
public class Aspects {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
       Comment cm = new Comment("Laura", "A description");
       service.deleteComment(cm);
    }
}
