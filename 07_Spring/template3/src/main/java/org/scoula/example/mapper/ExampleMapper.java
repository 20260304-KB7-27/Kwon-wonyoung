package org.scoula.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.scoula.example.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    // mapping
    List<BoardVO> selectAllByMapper();


    // annotation
    @Select("select * from tbl_board_ex")
    List<BoardVO> selectAllByAnnotation();
}
