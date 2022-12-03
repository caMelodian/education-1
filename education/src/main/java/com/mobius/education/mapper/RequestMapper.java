package com.mobius.education.mapper;

import com.mobius.education.domain.vo.RequestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestMapper {

//    요청추가
    public void insert(RequestVO requestVO);

//    수정
    public void update(RequestVO requestVO);

//    삭제
    public void delete(Long requestNumber);

//    조회
    public RequestVO select(Long requestNumber);

//    전체조회
    public List<RequestVO> selectAll();

//    나의 요청 수 조회
    public int selectUserRequestCount(Long userNumber);

//    나의 요청 전체 조회
    public List<RequestVO> selectUserRequestAll(Long userNumber);

    public List<RequestVO> selectUserRequestThree(Long userNumber);

}
