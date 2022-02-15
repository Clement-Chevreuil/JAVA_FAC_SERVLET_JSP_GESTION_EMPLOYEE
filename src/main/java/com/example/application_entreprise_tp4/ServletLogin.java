package com.example.application_entreprise_tp4;

import com.example.application_entreprise_tp4.Class.Employee;
import com.example.application_entreprise_tp4.Class.User;

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

        Employee employee = new Employee();
        employee.setFirstName("Jean");
        employee.setLastName("Dupont");
        employee.setRole("chef");

        User user = new User();
        user.setEmp(employee);
        user.setName(username);
        user.setPassword(password);

        HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
        response.sendRedirect("welcome.jsp");

    }
}
