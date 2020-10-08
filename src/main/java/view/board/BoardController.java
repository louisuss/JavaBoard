package view.board;

import biz.board.BoardService;
import biz.board.BoardVO;
import biz.board.impl.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    // ADD
    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo) throws IOException {
        MultipartFile uploadFile = vo.getUploadFile();
        if (!uploadFile.isEmpty()) {
            String fileName = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("D:/" + fileName));
        }

        boardService.insertBoard(vo);
        return "getBoardList.do";
    }

    // UPDATE
    @RequestMapping("/updateBoard.do")
    public String updateBoard(BoardVO vo) {
        boardService.updateBoard(vo);
        return "getBoardList.do";
    }

    // DELETE
    @RequestMapping("/deleteBoard.do")
    public String deleteBoard(BoardVO vo) {
        boardService.deleteBoard(vo);
        return "getBoardList.do";
    }

    // DETAIL
    @RequestMapping("/getBoard.do")
    public String getBoard(BoardVO vo, Model model) {
        model.addAttribute("board", boardService.getBoard((vo)));
        return "getBoard.jsp";
    }

    // CONDITION
    @ModelAttribute("conditionMap")
    public Map<String,String> searchConditionMap() {
        Map<String, String> conditionMap = new HashMap<>();
        conditionMap.put("TITLE", "TITLE");
        conditionMap.put("CONTENT", "CONTENT");
        return conditionMap;
    }

    // LIST
    @RequestMapping("/getBoardList.do")
    public String getBoardList(BoardVO vo,Model model) {
        // null check
        if (vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
        if (vo.getSearchKeyword() == null) vo.setSearchKeyword("");

        // Model Save
        model.addAttribute("boardList", boardService.getBoardList(vo));
        return "getBoardList.jsp";
    }

    @RequestMapping("/dataTransform.do")
    @ResponseBody
    public List<BoardVO> dataTransform(BoardVO vo) {
        vo.setSearchCondition("TITLE");
        vo.setSearchKeyword("");
        List<BoardVO> boardList = boardService.getBoardList(vo);
        return boardList;
    }
}
