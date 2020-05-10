package dsr.controller;

import dsr.entity.Artist;
import dsr.entity.DeezerSearch.DataItem;
import dsr.entity.User;
import dsr.persistence.DeezerSearchDao;
import dsr.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * this is the servlet to add and artist to a user
 */
@WebServlet(
        name = "addUserArtist",
        urlPatterns = "/addUserArtist")
public class AddUserArtist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String artistToAdd =  req.getParameter("addArtistName");

        req.setAttribute("updateType", "add");
        int userId = (int) req.getSession().getAttribute("sessionId");


        GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(userId);


        Artist addArtistObject;
        //CHECK IF THE ARTIST IS IN THE DATABASE FIRST!!!!!!
        if(artistDao.findByPropertyEqual("artistName", artistToAdd).size() == 0) {
            artistToAdd = "https://api.deezer.com/search/artist?q=" + artistToAdd.replace(" ", "%20");
            DeezerSearchDao searchDao = new DeezerSearchDao();
            DataItem deezerSearch = searchDao.getResponse(artistToAdd).getData().get(0);
            addArtistObject = new Artist(deezerSearch.getName(), deezerSearch.getId());
            artistDao.insert(addArtistObject);
            req.setAttribute("addedArtistName", deezerSearch.getName());
        } else {
            Artist tempArtist = artistDao.findByPropertyEqual("artistName", artistToAdd).get(0);
            addArtistObject = artistDao.getById(tempArtist.getArtistId());
//            get that artist with foundArtist
        }
        Set<Artist> userArtists = currentUser.getArtistsSet();
        userArtists.add(addArtistObject);
        currentUser.setArtistsSet(userArtists);

        userDao.saveOrUpdate(currentUser);
        req.setAttribute("artists", currentUser.getArtistsSet());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_artists.jsp");
        dispatcher.forward(req,resp);
    }
}
