package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CurrencyConverterServlet", value = "/converter")
public class CurrencyConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float rate = Float.parseFloat(request.getParameter("rate"));
        float  usd= Float.parseFloat(request.getParameter("usd"));

        float vnd = usd * rate;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h2>Rate " + rate + "</h2>");
        printWriter.println("<h2>USD " + usd + "</h2>");
        printWriter.println("<h2>VND " + vnd + "</h2>");
        printWriter.println("</html>");

    }
}
