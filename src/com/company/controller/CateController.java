package com.company.controller;

import com.company.entity.Categories;
import com.company.service.CategoriesService;
import com.company.service.serviceimpl.CategoriesServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CateController",value = "/user/cate")
public class CateController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CategoriesService cs = new CategoriesServiceimpl();
      List<Categories> categories = cs.showFath();
      request.setAttribute("categories",categories);
      request.getRequestDispatcher("/Category.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
