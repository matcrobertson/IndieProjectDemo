package dsr.controller;

import dsr.entity.Artist;
import dsr.entity.User;
import dsr.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "deleteUserArtist",
        urlPatterns = "/deleteUserArtist")
public class DeleteUserArtist extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        int userId = (int) req.getSession().getAttribute("sessionId");
        String artistNameDelete = req.getParameter("delArtistName");

        GenericDao<User> userDao = new GenericDao<>(User.class);
        GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);

        User user = userDao.getById(userId);
        Artist removeArtist = artistDao.findByPropertyEqual("artistName", artistNameDelete).get(0);

        user.getArtistsSet().remove(removeArtist);
        userDao.saveOrUpdate(user);
        req.setAttribute("artists", user.getArtistsSet());
        req.setAttribute("deletedArtist", artistNameDelete);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_artists.jsp");
        dispatcher.forward(req, resp);
    }
}
