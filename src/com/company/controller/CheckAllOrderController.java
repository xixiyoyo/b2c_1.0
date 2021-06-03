package com.company.controller;

import com.company.entity.Orders;
import com.company.service.OrdersService;
import com.company.service.serviceimpl.OrdersServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CheckAllOrderController",value = "/user/safe/checkAllOrder")
public class CheckAllOrderController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      OrdersService os = new OrdersServiceimpl();
      List<Orders> list = os.searchOrders();
      request.setAttribute("orderAll",list);
      request.getRequestDispatcher("/CheckAllOrder.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
