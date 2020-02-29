package controller;

import entity.User;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/artists"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao userDao = new GenericDao(User.class);
        List<User> users = userDao.getAll();
        req.setAttribute("users", users);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_artists.jsp");
        dispatcher.forward(req, resp);
    }
}