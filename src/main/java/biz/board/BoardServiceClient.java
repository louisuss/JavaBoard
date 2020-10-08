package biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BoardServiceClient {
    public static void main(String[] args) {
        // Spring 구동
        AbstractApplicationContext container =
                new GenericXmlApplicationContext("applicationContext.xml");

        // Spring 컨테이너로부터 BoardServiceImpl 객체 Lookup
        BoardService boardService = (BoardService)container.getBean("boardService");

        // 글 등록 테스트
        BoardVO vo = new BoardVO();
        vo.setTitle("Temp Title");
        vo.setWriter("KIM");
        vo.setContent("Temp Content ......");
        boardService.insertBoard(vo);

        // 글 목록 검색 기능 테스트
        List<BoardVO> boardList = boardService.getBoardList(vo);
        for (BoardVO boardVO : boardList) {
            System.out.println("---> " + boardVO.toString());
        }
        container.close();
    }
}
