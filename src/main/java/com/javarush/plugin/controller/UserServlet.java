package com.javarush.plugin.controller;


import com.javarush.plugin.entity.User;
import com.javarush.plugin.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {

    UserService userService = UserService.USER_SERVICE;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // получаем параметр из запроса по id
        String parameterId = request.getParameter("id");

        // проверяем логигу если он есть или нет
        if (Objects.nonNull(parameterId)) {
            long id = Long.parseLong(parameterId);
            Optional<User> optionalUser = userService.get(id);

            if(optionalUser.isPresent()) {
                User user = optionalUser.get();
                request.setAttribute("user", user);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/user.jsp");
                dispatcher.forward(request, response);
            }

        }
//        Collection<User> users = userService.getAll();
//        request.setAttribute("users", users);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/users.jsp");
//        requestDispatcher.forward(request, response);

        response.sendRedirect("users");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
