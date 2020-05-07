package dsr.controller;

import dsr.entity.Artist;
import dsr.entity.Role;
import dsr.entity.User;
import dsr.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "/signUp",
        urlPatterns = "/signUp")
public class AddUser extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String pw = (String) req.getAttribute("password1");
        String pw2 = (String)req.getAttribute("password2");
        String userName = (String) req.getAttribute("userName");
        RequestDispatcher dispatcher;

        if(pw.equals(pw2) && !pw.equals("") && !userName.equals("")) {
            GenericDao<User> userDao = new GenericDao<>(User.class);
            GenericDao<Role> roleDao = new GenericDao<>(Role.class);
            Role newUserRole = new Role("user", userName);
            roleDao.insert(newUserRole);
            User newUser = new User(newUserRole, userName, pw);
            userDao.insert(newUser);

             dispatcher = req.getRequestDispatcher("/sign_in.jsp");

        } else {
            req.setAttribute("error", "error");
            dispatcher = req.getRequestDispatcher("/home_page.jsp");
        }
            dispatcher.forward(req, resp);
    }

}
