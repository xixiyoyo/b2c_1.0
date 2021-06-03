package com.company.controller;

import com.company.entity.Carts;
import com.company.entity.Users;
import com.company.service.CartsService;
import com.company.service.serviceimpl.CartsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AlterCartFinController",value = "/user/safe/alterCartFin")
public class AlterCartFinController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CartsService cs = new CartsServiceimpl();
      String spid = request.getParameter("spid");
      String g_did = request.getParameter("g_did");
      String sp_num = request.getParameter("sp_num");
      String sp_money = request.getParameter("sp_money");
      HttpSession session = request.getSession();
      Users users = (Users) session.getAttribute("user");
      Carts cart = new Carts(Integer.valueOf(spid),Integer.valueOf(g_did),users.getUid(),Integer.valueOf(sp_num),Double.valueOf(sp_money));
      int i = cs.modifyCart(cart);
      List<Carts> carts = cs.checkAllCart();
      request.setAttribute("carts",carts);
      request.getRequestDispatcher("/CheckCart.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
