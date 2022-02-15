package com.example.application_entreprise_tp4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ClassEmployee classEmployee = new ClassEmployee();
        classEmployee.setFirstName("Jean");
        classEmployee.setLastName("Dupont");
        classEmployee.setRole("chef");

        ClassUser classUser = new ClassUser();
        classUser.setEmp(classEmployee);
        classUser.setName(username);
        classUser.setPassword(password);

        HttpSession session = request.getSession(true);
        session.setAttribute("user", classUser);
        response.sendRedirect("welcome.jsp");

    }
}
