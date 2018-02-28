package controller;

import fr.cesi.qcm_backend.Teacher;
import fr.cesi.qcm_backend.User;
import fr.cesi.qcm_backend.dao.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    private static String HOME_JSP = "/WEB-INF/jsp/index.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
       /* RequestDispatcher dispatcher = req.getRequestDispatcher(HOME_JSP);
        dispatcher.forward(req, resp);*/
        UserDAO udao = new UserDAO();
        //List<User> users = udao.findAll();
        User t = udao.find("c7d91743-2d6f-4aa0-8ad8-8e031f9c9e22");
        HttpSession session = req.getSession(true);
        session.setAttribute("user",(Teacher) t);
        //req.setAttribute("user",(Teacher) t);
        this.getServletContext().getRequestDispatcher(HOME_JSP);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
