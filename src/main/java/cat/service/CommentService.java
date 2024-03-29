package cat.service;

import cat.dto.CommentDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface CommentService {
    int getCount(Integer bno) throws Exception;

    @Transactional(rollbackFor = Exception.class)
    int remove(Integer cno, Integer bno, String commenter) throws Exception;

    @Transactional(rollbackFor = Exception.class)
    int write(CommentDTO commentDto) throws Exception;

    List<CommentDTO> getList(Integer bno, Integer page) throws Exception;

    CommentDTO read(Integer cno) throws Exception;

    int modify(CommentDTO commentDto) throws Exception;
}
