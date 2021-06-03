package com.company.controller;

import com.company.entity.Carts;
import com.company.entity.Items;
import com.company.entity.Orders;
import com.company.service.CartsService;
import com.company.service.ItemsService;
import com.company.service.OrdersService;
import com.company.service.serviceimpl.CartsServiceimpl;
import com.company.service.serviceimpl.ItemsServiceimpl;
import com.company.service.serviceimpl.OrdersServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddOrder2Controller",value = "/user/safe/addOrder2")
public class AddOrder2Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      ItemsService is = new ItemsServiceimpl();
      CartsService cs = new CartsServiceimpl();
      OrdersService os = new OrdersServiceimpl();
      String oid = request.getParameter("oid");
      String uid = request.getParameter("uid");
      String aid = request.getParameter("aid");
      String o_money = request.getParameter("o_money");
      String g_did = request.getParameter("g_did");
      String i_num = request.getParameter("i_num");
      String i_money = request.getParameter("i_money");
      String[] spids = request.getParameterValues("spid");


      Orders orders = new Orders(oid,Integer.valueOf(aid),Integer.valueOf(uid),Double.valueOf(o_money));
      int i = os.addOrder(orders);
      if(i > 0){
        if(g_did != null && i_num != null && i_money != null){
          Items items = new Items(Integer.valueOf(g_did),oid,Integer.valueOf(i_num),Double.valueOf(i_money));
          int i1 = is.addOrder(items);
        }
        if(spids != null){
          for (String s : spids) {
            Carts carts = cs.checkCartById(Integer.valueOf(s));
            Items items = new Items(carts.getG_did(),orders.getOid(),carts.getSp_num(),carts.getSp_money());
            int i2 = is.addOrder(items);
            int i1 = cs.delCart(Integer.valueOf(s));
          }
        }
      }

      Orders orderFin = os.checkOrderByOid(oid);
      request.setAttribute("orderFin",orderFin);
      request.getRequestDispatcher("/GenerateOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
