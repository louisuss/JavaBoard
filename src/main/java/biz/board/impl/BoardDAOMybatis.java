package biz.board.impl;

import biz.board.BoardVO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardDAOMybatis extends SqlSessionDaoSupport {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public void insertBoard(BoardVO vo) {
        System.out.println("insertBoard()");
        getSqlSession().insert("BoardDAO.insertBoard", vo);
    }

    public void updateBoard(BoardVO vo) {
        System.out.println("updateBoard()");
        getSqlSession().update("BoardDAO.updateBoard", vo);
    }

    public void deleteBoard(BoardVO vo) {
        System.out.println("deleteBoard()");
        getSqlSession().delete("BoardDAO.deleteBoard", vo);
    }

    public BoardVO getBoard(BoardVO vo) {
        System.out.println("getBoard()");
        return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
    }

    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("getBoardList()");
        return getSqlSession().selectList("BoardDAO.getBoardList", vo);
    }
}
