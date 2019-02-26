package app.servlets;

import app.controller.Controller;
import app.exceptions.InputDataAlreadyExistException;
import app.exceptions.WrongInputFormat;
import app.model.entity.Note;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationFormServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Controller controller = new Controller();
        RequestDispatcher requestDispatcher;
        try {
            Note note = controller.processUser(req.getParameter("login"),
                    req.getParameter("email"));
            req.setAttribute("note", note);
            requestDispatcher = req.getRequestDispatcher("userPage.jsp");
            requestDispatcher.forward(req, resp);
        } catch (WrongInputFormat e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", e.getMessage() + e.getEnteredData());
            requestDispatcher = req.getRequestDispatcher("errorPage.jsp");
            requestDispatcher.forward(req, resp);
        } catch (InputDataAlreadyExistException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", String.format(e.getMessage(), e.getEnteredData()));
            requestDispatcher = req.getRequestDispatcher("errorPage.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
