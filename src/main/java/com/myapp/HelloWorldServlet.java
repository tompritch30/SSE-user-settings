package com.myapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // Forward to the JSP file to render the response
        RequestDispatcher view = request.getRequestDispatcher("HelloWorld.jsp");
        view.forward(request, response);
    }
}
