package dsr.controller;


import dsr.DeezerMethods;
import dsr.entity.Artist;
import dsr.entity.DeezerAlbum.DataItem;
import dsr.entity.DeezerSong;
import dsr.entity.User;
import dsr.persistence.DeezerAlbumDao;
import dsr.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebServlet(
        name = "artistSearch",
        urlPatterns = "/artistSearch")
public class SearchByDateArtist extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            int userId = (int) req.getSession().getAttribute("sessionId");
            GenericDao<User> userGenericDao = new GenericDao<>(User.class);
            User currentUser = userGenericDao.getById(userId);
            DeezerMethods deezerMethods = new DeezerMethods();


            //i need this for my select dropdown
            List<Artist> userArtists = new ArrayList<>(currentUser.getArtistsSet());
            req.setAttribute("artists", userArtists);

            Artist currentArtist = new Artist();
            String stringDate = req.getParameter("artistCheckDate");

            String selectedArtist = req.getParameter("artistName");
            //if the user has submitted something
            if(stringDate != null && selectedArtist != null) {
                LocalDate userDate = deezerMethods.stringToLocalDate(stringDate);
                for(Artist artist : userArtists) {
                    if(selectedArtist.equals(artist.getArtistName())) {
                        currentArtist = artist;
                    }
                }
                List<DeezerSong> artistSongs = deezerMethods.getArtistAlbums(userDate, currentArtist.getDeezerId());
                req.setAttribute("songs", artistSongs);
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher("/artist_update.jsp");
            dispatcher.forward(req,resp);

        }

}
