package dsr.controller;


import dsr.entity.Role;
import dsr.entity.User;
import dsr.persistence.GenericDao;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * this is the sign up servlet
 */
@WebServlet(
        name = "/signUp",
        urlPatterns = "/signUp")
@Log4j2
public class AddUser extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String pw = req.getParameter("password1");
        String pw2 = req.getParameter("password2");
        String userName = req.getParameter("userName");
        RequestDispatcher dispatcher;
        GenericDao<User> userDao = new GenericDao<>(User.class);
        List<User> userList = userDao.findByPropertyEqual("userName", userName);

        if(pw.equals(pw2) && !pw.equals("") && !userName.equals("") && userList.size() == 0) {
//            GenericDao<User> userDao = new GenericDao<>(User.class);
            GenericDao<Role> roleDao = new GenericDao<>(Role.class);
            Role newUserRole = new Role("user", userName);
            roleDao.insert(newUserRole);
            User newUser = new User(newUserRole, userName, pw);
            userDao.insert(newUser);
            log.info(newUser.getUserName());
             resp.sendRedirect("signIn");

        } else {
            log.info(pw + " " + pw2 + " " + userName);
            req.setAttribute("userFail", "invalid credentials");
            dispatcher = req.getRequestDispatcher("/sign_up.jsp");
            dispatcher.forward(req, resp);
        }
    }

}
