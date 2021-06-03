package com.company.controller;

import com.company.entity.*;
import com.company.service.AddressService;
import com.company.service.G_detailService;
import com.company.service.ItemsService;
import com.company.service.serviceimpl.AddressServiceimpl;
import com.company.service.serviceimpl.G_detailServiceimpl;
import com.company.service.serviceimpl.ItemsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddOrderController",value = "/user/safe/addOrder")
public class AddOrderController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      G_detailService gs = new G_detailServiceimpl();
      ItemsService is = new ItemsServiceimpl();
      AddressService as = new AddressServiceimpl();
      String g_did = request.getParameter("g_did");
      String num = request.getParameter("num");
      HttpSession session = request.getSession();
      Users users = (Users) session.getAttribute("user");
      G_detail g_detail = gs.queryById(Integer.valueOf(g_did));
      Orders order = new Orders(String.valueOf(hashCode()),users.getUid(),g_detail.getD_price()*Integer.valueOf(num));
      Items items = new Items(Integer.valueOf(g_did),order.getOid(),Integer.valueOf(num),g_detail.getD_price()*Integer.valueOf(num));
      List<Address> addressList = as.checkAddressByUid(users.getUid());
      session.setAttribute("order",order);
      request.setAttribute("item",items);
      request.setAttribute("addressList",addressList);
      request.getRequestDispatcher("/AddOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
