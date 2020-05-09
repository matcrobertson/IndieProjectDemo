//package dsr.controller;
//
//
//import dsr.DeezerMethods;
//import dsr.entity.Artist;
//import dsr.entity.DeezerAlbum.DataItem;
//import dsr.entity.User;
//import dsr.persistence.DeezerAlbumDao;
//import dsr.persistence.GenericDao;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.xml.crypto.Data;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//
//@WebServlet(
//        name = "artistSearch",
//        urlPatterns = "/artistSearch")
//public class SearchByDateArtist extends HttpServlet {
//
//        @Override
//        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            int userId = Integer.parseInt(req.getSession().getId());
//            GenericDao<User> userGenericDao = new GenericDao<>(User.class);
//            User currentUser = userGenericDao.getById(userId);
//            GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);
//
//            //i need this for my select dropdown
//            List<Artist> userArtists = new ArrayList<>(currentUser.getArtistsSet());
//            req.setAttribute("artists", userArtists);
//            //checks to see if it was submitted or if a link was clicked to get here
//            Date userDate = (Date)req.getAttribute("artistCheckDate");
//            String selectedArtist = (String)req.getAttribute("artistName");
//            if (userDate == null || selectedArtist.equals("")) {
//                RequestDispatcher dispatcher = req.getRequestDispatcher("artist_update.jsp");
//                dispatcher.forward(req,resp);
//            } else {
//                Artist userArtist = artistDao.findByPropertyEqual("artist_name", selectedArtist).get(0);
//                DeezerMethods deezerMethods = new DeezerMethods();
//                LocalDate userLocalDate = userDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                String selectedArtistId = userArtist.getDeezerId();
//                List<String> artistAlbums = deezerMethods.getArtistAlbums(selectedArtistId, userLocalDate);
//                List<DataItem> artistSongs = deezerMethods.addToSongsList(artistAlbums);
//                req.setAttribute("songs", artistSongs);
//                resp.sendRedirect("/artist_update.jsp");
//            }
//
//
//        }
//
//}
