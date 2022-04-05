package com.es.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
    private final List<String> messages = new ArrayList(Arrays.asList(
            "message1", "message2", "message3"
    ));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("messages", messages);
        req.getRequestDispatcher("/WEB-INF/pages/messages.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i < 2; i++) {
            messages.set(i, req.getParameter("msg" + i));
        }
        req.getRequestDispatcher("/WEB-INF/pages/result.jsp").forward(req, resp);
    }
}
