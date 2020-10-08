package view.user;

import biz.user.UserVO;
import biz.user.impl.UserDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Log In");

        String id = request.getParameter("id");
        String password = request.getParameter("password");

        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPassword(password);

        UserDAO userDAO = new UserDAO();
        UserVO user = userDAO.getUser(vo);

        ModelAndView mav = new ModelAndView();
        if (user != null) {
            mav.setViewName("redirect:getBoardList.do");
        } else {
            mav.setViewName("redirect:login");
        }
        return mav;
    }

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
        if (vo.getId() == null || vo.getId().equals("")) {
            throw new IllegalArgumentException("ID MUST NEED");
        }
        UserVO user = userDAO.getUser(vo);
        if (user!=null) {
            session.setAttribute("userName", user.getName());
            return "getBoardList.do";
        }
        else return "login.jsp";
    }
}
