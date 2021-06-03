package com.company.controller;

import com.company.entity.Users;
import com.company.service.UsersService;
import com.company.service.serviceimpl.UsersServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Update2UserController",value = "/user/safe/update2User")
public class Update2UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      UsersService us = new UsersServiceimpl();
      String uid = request.getParameter("id");
      String uname = request.getParameter("username");
      String password = request.getParameter("password");
      String email = request.getParameter("email");
      String sex = request.getParameter("sex");
      Users users = new Users(Integer.valueOf(uid),uname,password,email,sex);
      int i = us.updateUser(users);
      if(i > 0){
        response.sendRedirect(request.getContextPath()+"/Test.jsp");
      }else {
        response.sendRedirect(request.getContextPath()+"/ModifyUser.jsp");
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
