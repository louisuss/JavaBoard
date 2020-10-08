package view.board;

import biz.board.BoardVO;
import biz.board.impl.BoardDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GetBoardListController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("getBoardList");

        BoardVO vo = new BoardVO();
        BoardDAO boardDAO = new BoardDAO();
        List<BoardVO> boardList = boardDAO.getBoardList(vo);

//        HttpSession session = request.getSession();
//        session.setAttribute("boardList", boardList);
//        return "getBoardList";
        ModelAndView mav = new ModelAndView();
        mav.addObject("boardList", boardList);
        mav.setViewName("getBoardList");
        return mav;

    }
}
