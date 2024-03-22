
package com.liyicai.week3.demo;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends javax.servlet.http.HttpServlet {
    @Override

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String gender =request.getParameter("gender");
        String birthDate =request.getParameter("birthDate");

        PrintWriter writer =response.getWriter();
        writer.println("<br> username:"+username);
        writer.println("<br> password:"+password);
        writer.println("<br> email:"+email);
        writer.println("<br> gender:"+gender);
        writer.println("<br> birth Date:"+birthDate);
        response.getWriter().write("提交成功");
        writer.close();
    }
}
