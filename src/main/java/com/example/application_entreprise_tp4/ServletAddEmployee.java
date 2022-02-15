package com.example.application_entreprise_tp4;

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
        List<ClassEmployee> listClassEmployee = (List<ClassEmployee>) session.getAttribute("listEmployee");

        ClassEmployee classEmployee = new ClassEmployee();
        classEmployee.setFirstName(firstName);
        classEmployee.setLastName(lastName);
        classEmployee.setRole(role);

        listClassEmployee.add(classEmployee);

        session.setAttribute("listEmployee", listClassEmployee);

        request.getRequestDispatcher("listEmployee.jsp").forward(request, response);
    }
}
