package com.company.controller;

import com.company.entity.*;
import com.company.service.AddressService;
import com.company.service.CartsService;
import com.company.service.ItemsService;
import com.company.service.serviceimpl.AddressServiceimpl;
import com.company.service.serviceimpl.CartsServiceimpl;
import com.company.service.serviceimpl.ItemsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddCartOrderController",value = "/user/safe/addCOrder")
public class AddCartOrderController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      AddressService as = new AddressServiceimpl();
      //ItemsService is = new ItemsServiceimpl();
      CartsService cs = new CartsServiceimpl();
      String[] spids = request.getParameterValues("spid");
      double sum = 0;
      HttpSession session = request.getSession();
      Users user = (Users) session.getAttribute("user");
      for (String s : spids) {
        Carts carts = cs.checkCartById(Integer.valueOf(s));
        sum += carts.getSp_money();
      }
      Orders orders = new Orders(String.valueOf(hashCode()),user.getUid(),sum);
//      for (String s : spids) {
//        Carts carts = cs.checkCartById(Integer.valueOf(s));
//        Items items = new Items(carts.getG_did(),orders.getOid(),carts.getSp_num(),carts.getSp_money());
//        int i = is.addOrder(items);
//      }
      List<Address> addressList = as.checkAddressByUid(user.getUid());
      session.setAttribute("order",orders);
      request.setAttribute("spids",spids);
      request.setAttribute("addressList",addressList);
      request.getRequestDispatcher("/AddOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
