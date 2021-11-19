package com.example.lab5.servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet")
public class SaveDataServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        String username = request.getParameter("firstName");
        out.println(username);
        String lastname = request.getParameter("lastName");
        out.println(lastname);
        String gender = request.getParameter("gender");
        out.println(gender);
        String city = request.getParameter("city");
        out.println(city);
        String country = request.getParameter("country");
        out.println(country);
    }
    public void destroy() {
    }
}