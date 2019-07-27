package com.lxh.service;

import com.lxh.pojo.po.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommentService {
    boolean doCreate(Comment comment);
    boolean doLoad(int id,int status);
    List<Comment> showOnloadComment(int works_id);
    List<Comment> showComment(int works_id);
}
