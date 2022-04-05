package com.es.servlets;

import com.es.service.CardValidator;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
    @EJB
    private CardValidator validator;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("res", validator.validate(req.getParameter("date")));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
