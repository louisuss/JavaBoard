package view.user;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("log out");

        HttpSession session = request.getSession();
        session.invalidate();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:login");
        return mav;
    }
}
