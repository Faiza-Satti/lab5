package com.example.lab5.servlet;

import db.DbConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletData")
public class ServletData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        String firstname = request.getParameter("fName");
        out.println(firstname);
        String lastname = request.getParameter("lName");
        out.println(lastname);
        String gender = request.getParameter("gender");
        out.println(gender);
        String city = request.getParameter("city");
        out.println(city);
        String country = request.getParameter("country");
        out.println(country);

        DbConnection Dbcon=new DbConnection();
        Dbcon.insertRecord(firstname,lastname,gender,city,country);

        response.sendRedirect("display");
    }
}
