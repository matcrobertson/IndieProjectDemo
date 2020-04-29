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

@WebServlet(
            urlPatterns = "/home_page"
    )
public class SignedIn extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sessionId = req.getSession().getId();
        GenericDao userArtist = new GenericDao(Artist.class);

        RequestDispatcher dispatcher = req.getRequestDispatcher("home_page.jsp");
        dispatcher.forward(req,resp);
    }

}
