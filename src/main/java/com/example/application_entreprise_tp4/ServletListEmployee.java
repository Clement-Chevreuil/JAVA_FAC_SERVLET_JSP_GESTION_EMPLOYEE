package com.example.application_entreprise_tp4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletListEmployee", value = "/ServletListEmployee")
public class ServletListEmployee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        if(session.getAttribute("listEmployee") == null)
        {
            List<ClassEmployee> listClassEmployee = new ArrayList<ClassEmployee>();
            session.setAttribute("listEmployee", listClassEmployee);
        }

        request.getRequestDispatcher("listEmployee.jsp").forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
