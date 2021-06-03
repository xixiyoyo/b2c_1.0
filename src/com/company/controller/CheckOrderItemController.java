package com.company.controller;

import com.company.entity.Items;
import com.company.entity.Orders;
import com.company.service.ItemsService;
import com.company.service.OrdersService;
import com.company.service.serviceimpl.ItemsServiceimpl;
import com.company.service.serviceimpl.OrdersServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CheckOrderItemController",value = "/user/safe/checkOrderItem")
public class CheckOrderItemController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      ItemsService is = new ItemsServiceimpl();
      String oid = request.getParameter("oid");
      List<Items> list = is.checkByOid(oid);
      request.setAttribute("itemList",list);
      request.getRequestDispatcher("/CheckOrderItem.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
