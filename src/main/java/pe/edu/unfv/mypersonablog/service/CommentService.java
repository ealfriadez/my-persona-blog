package pe.edu.unfv.mypersonablog.service;

import org.springframework.stereotype.Service;
import pe.edu.unfv.mypersonablog.entity.CommentEntity;

import java.util.Optional;


public interface CommentService {

    Optional<CommentEntity> getCommentById(Long id);
    void createComment(CommentEntity comment);
    void updateComment(Long id, CommentEntity entity);
    void deleteComment(Long id);
}
