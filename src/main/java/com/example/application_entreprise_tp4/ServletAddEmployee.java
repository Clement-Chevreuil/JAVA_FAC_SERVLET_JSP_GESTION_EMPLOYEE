package com.example.application_entreprise_tp4;

import com.example.application_entreprise_tp4.Class.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletAddEmployee", value = "/ServletAddEmployee")
public class ServletAddEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String role = request.getParameter("role");

        HttpSession session = request.getSession();
        List<Employee> listEmployee = (List<Employee>) session.getAttribute("listEmployee");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setRole(role);

        listEmployee.add(employee);

        session.setAttribute("listEmployee", listEmployee);

        request.getRequestDispatcher("listEmployee.jsp").forward(request, response);
    }
}
