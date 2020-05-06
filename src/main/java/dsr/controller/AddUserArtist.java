package dsr.controller;

import dsr.entity.Artist;
import dsr.entity.DeezerSearch.DataItem;
import dsr.entity.User;
import dsr.persistence.DeezerSearchDao;
import dsr.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet(name = "addUserArtist")
public class AddUserArtist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String artistToAdd = (String) req.getAttribute("addArtist");
        String userId = req.getSession().getId();


        GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(Integer.parseInt(userId));

        Artist foundArtist = artistDao.findByPropertyEqual("artist_name", artistToAdd).get(0);
        Artist addArtistObject = new Artist();
        //CHECK IF THE ARTIST IS IN THE DATABASE FIRST!!!!!!
        if(artistDao.findByPropertyEqual("artist_name", artistToAdd).size() == 0) {
            artistToAdd = "https://api.deezer.com/search?q=" + artistToAdd.replace(" ", "%20");
            DeezerSearchDao searchDao = new DeezerSearchDao();

            for(DataItem deezerSearch : searchDao.getResponse(artistToAdd).getData()) {
                addArtistObject.setDeezerId(deezerSearch.getArtist().getId());
                addArtistObject.setArtistName(deezerSearch.getArtist().getName());
                req.setAttribute("addedArtistName", deezerSearch.getArtist().getName());
                break;
            }
        } else {
            addArtistObject = foundArtist;
//            get that artist by with foundArtist
        }
        Set<Artist> userArtists = currentUser.getArtistsSet();
        userArtists.add(addArtistObject);
        currentUser.setArtistsSet(userArtists);
        userDao.saveOrUpdate(currentUser);
    }
}
