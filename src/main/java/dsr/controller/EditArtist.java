package dsr.controller;

import dsr.entity.User;
import dsr.persistence.GenericDao;

import javax.persistence.GeneratedValue;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * this passes the current user's artists to the edit page
 */
@WebServlet( name = "editArtist",
        urlPatterns = "/editArtist")
public class EditArtist extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int sessionId = (int) req.getSession().getAttribute("sessionId");
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(sessionId);
        req.setAttribute("artists", currentUser.getArtistsSet());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_artists.jsp");
        dispatcher.forward(req, resp);
    }
}
