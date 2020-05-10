package dsr.controller;

import dsr.entity.User;
import dsr.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * sets the session id to use through the rest of the application
 */
@WebServlet(
        name = "signIn",
        urlPatterns = { "/signIn"}
)
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<User> userDao = new GenericDao<>(User.class);


        User currentUser = userDao.findByPropertyEqual("userName", req.getRemoteUser()).get(0);
        HttpSession session = req.getSession();
        session.setAttribute("sessionId", currentUser.getId());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/home_page.jsp");
        dispatcher.forward(req, resp);
    }
}
