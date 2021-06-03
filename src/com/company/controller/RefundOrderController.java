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

@WebServlet(name = "RefundOrderController",value = "/user/safe/refundOrder")
public class RefundOrderController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      OrdersService os = new OrdersServiceimpl();
      String oid = request.getParameter("oid");
      Orders orders = os.checkOrderByOid(oid);
      orders.setIspay(4);
      int i = os.alterOrder(orders);
      request.setAttribute("orderFin",orders);
      request.getRequestDispatcher("/GenerateOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
