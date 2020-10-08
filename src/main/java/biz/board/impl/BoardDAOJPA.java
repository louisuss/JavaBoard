package biz.board.impl;

import biz.board.BoardVO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BoardDAOJPA {
    @PersistenceContext
    private EntityManager em;

    public void insertBoard(BoardVO vo) {
        System.out.println("insertBoard()");
        em.persist(vo);
    }

    public void updateBoard(BoardVO vo) {
        System.out.println("updateBoard()");
        em.merge(vo);
    }

    public void deleteBoard(BoardVO vo) {
        System.out.println("deleteBoard()");
        em.remove(em.find(BoardVO.class, vo.getSeq()));
    }

    public BoardVO getBoard(BoardVO vo) {
        System.out.println("getBoard()");
        return (BoardVO)em.find(BoardVO.class, vo.getSeq());
    }

    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("getBoardList()");
        return em.createQuery("select b from BoardVO b order by b.seq desc").getResultList();
    }
}
