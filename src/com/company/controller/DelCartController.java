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

@WebServlet(name = "DelCartController",value = "/user/safe/delCart")
public class DelCartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CartsService cs = new CartsServiceimpl();
      String spid = request.getParameter("spid");
      Carts carts = cs.checkCartById(Integer.valueOf(spid));
      carts.setSp_status(1);
      int i = cs.modifyCart(carts);
      response.sendRedirect(request.getContextPath()+"/CheckCart.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
