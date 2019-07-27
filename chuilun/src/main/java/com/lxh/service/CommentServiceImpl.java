package com.lxh.service;

import com.lxh.dao.CommentDao;
import com.lxh.pojo.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentDao commentDao;
    public boolean doCreate(Comment comment) {
        return commentDao.doCreate(comment);
    }

    public boolean doLoad(int id, int status) {
        return commentDao.doLoad(id,status);
    }
    public List<Comment> showOnloadComment(int works_id){
        return commentDao.showOnloadComment(works_id);
    }

    public List<Comment> showComment(int works_id) {
        List<Comment> comments=commentDao.showComment(works_id);
        List<Integer> ids = new ArrayList<Integer>();
        for(Comment comment:comments){
            int id=comment.getEditor_id();
            ids.add(id);
        }
        return comments;
    }
}
