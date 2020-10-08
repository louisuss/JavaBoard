package biz.user.impl;

import biz.user.UserService;
import biz.user.UserVO;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserVO getUser(UserVO vo) {
        return userDAO.getUser(vo);
    }
}
