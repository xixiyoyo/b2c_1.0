package com.company.controller;

import com.company.entity.Carts;
import com.company.service.CartsService;
import com.company.service.serviceimpl.CartsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CheckCartController",value = "/user/safe/checkCart")
public class CheckCartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CartsService cs = new CartsServiceimpl();
      List<Carts> carts = cs.checkAllCart();
      request.setAttribute("carts",carts);
      request.getRequestDispatcher("/CheckCart.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
