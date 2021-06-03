package com.company.controller;

import com.company.entity.Users;
import com.company.service.UsersService;
import com.company.service.serviceimpl.UsersServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginLogicController",value = "/user/loginLogic")
public class LoginLogicController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      UsersService us = new UsersServiceimpl();
      String name = request.getParameter("username");
      String password = request.getParameter("password");
      Users user = us.login(name);
      if(user != null){
        int i = us.islogin(user, password);
        if(i > 0){
          HttpSession session = request.getSession();
          session.setAttribute("user",user);
          Cookie cookie = new Cookie("uname",name);
          Cookie cookie1 = new Cookie("password",password);
          cookie.setMaxAge(60*60);
          cookie1.setMaxAge(60*60);
          response.sendRedirect(request.getContextPath()+"/Test.jsp");
        }else {
          response.sendRedirect(request.getContextPath()+"/Login.jsp");
        }
      }else{
        response.sendRedirect(request.getContextPath()+"/Login.jsp");
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
