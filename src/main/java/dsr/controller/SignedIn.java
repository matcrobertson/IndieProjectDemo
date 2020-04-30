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
import java.util.Set;

@WebServlet(
            urlPatterns = "/home_page"
    )
public class SignedIn extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int currentUserId =  Integer.parseInt(req.getSession().getId());
        User currentUserObject = new User();
        currentUserObject.setId(currentUserId);



        RequestDispatcher dispatcher = req.getRequestDispatcher("home_page.jsp");
        dispatcher.forward(req,resp);
    }

}
