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
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@WebServlet(
            urlPatterns = "/home_page"
    )
public class SignedIn extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        get the user id from the session
        int currentUserId =  Integer.parseInt(req.getSession().getId());
//        USE THE DAO YOU SILLY GOOSE!!!!!
//        instantiate dao
        GenericDao<User> userDao = new GenericDao<>(User.class);

        User currentUser = userDao.getById(currentUserId);
//        convert a set to a list
        List<Artist> userArtists = new ArrayList<>(currentUser.getArtistsSet());
        DeezerMethods deezerMethods = new DeezerMethods();
        Date deprecatedDate = (Date)(req.getAttribute("checkDate"));
       LocalDate userDate = deprecatedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for(Artist currentArtist : userArtists) {
            String artistId = currentArtist.getDeezerId();
            deezerMethods.getArtistAlbums(artistId, userDate);

        }

        resp.sendRedirect("home_page.jsp");
//        RequestDispatcher dispatcher = req.getRequestDispatcher("home_page.jsp");
//        dispatcher.forward(req,resp);
    }

}
