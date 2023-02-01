package com.javarush.plugin.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "GameServlet", value = "/game")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // создаем новую сессию
        HttpSession currentSession = request.getSession(true);
        System.out.println(currentSession);

        getServletContext().getRequestDispatcher("/game.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TO DO CREATE GAME
    }
}
