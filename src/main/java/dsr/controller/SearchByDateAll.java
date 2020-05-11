package dsr.controller;

import dsr.DeezerMethods;
import dsr.entity.Artist;

import dsr.entity.DeezerSong;
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * this servlet returns all artist songs
 */
@WebServlet(
            name = "homePage",
            urlPatterns = "/home_page"
    )
@Log4j2
public class SearchByDateAll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        get the user id from the session
        int currentUserId = (int) req.getSession().getAttribute("sessionId");
//        USE THE DAO YOU SILLY GOOSE!!!!!
//        instantiate dao

        GenericDao<User> userDao = new GenericDao<>(User.class);

        User currentUser = userDao.getById(currentUserId);
//        convert a set to a list
        List<Artist> userArtists = new ArrayList<>(currentUser.getArtistsSet());

        if(!req.getParameter("checkDate").equals("")) {


            DeezerMethods deezerMethods = new DeezerMethods();
            LocalDate userDate = deezerMethods.stringToLocalDate(req.getParameter("checkDate"));


            List<DeezerSong> userSongs = new ArrayList<>();
            for (Artist currentArtist : userArtists) {
                String artistId = currentArtist.getDeezerId();
                userSongs.addAll(deezerMethods.getArtistAlbums(userDate, artistId));

            }
                log.info(userSongs.size());
                req.setAttribute("songs", userSongs);
        }

            RequestDispatcher dispatcher = req.getRequestDispatcher("/home_page.jsp");
            dispatcher.forward(req, resp);
        }
}