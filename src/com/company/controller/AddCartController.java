package com.company.controller;

import com.company.entity.Carts;
import com.company.entity.G_detail;
import com.company.entity.Users;
import com.company.service.CartsService;
import com.company.service.G_detailService;
import com.company.service.serviceimpl.CartsServiceimpl;
import com.company.service.serviceimpl.G_detailServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddCartController",value = "/user/safe/addCart")
public class AddCartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      CartsService cs = new CartsServiceimpl();
      G_detailService gs = new G_detailServiceimpl();
      String g_did = request.getParameter("g_did");
      String num = request.getParameter("num");
      HttpSession session = request.getSession();
      Users users = (Users) session.getAttribute("user");
      G_detail g_detail = gs.queryById(Integer.valueOf(g_did));

      Carts carts = new Carts(Integer.valueOf(g_did),users.getUid(),Integer.valueOf(num),Integer.valueOf(num)*g_detail.getD_price());
      cs.addCart(carts);
      response.sendRedirect(request.getContextPath()+"/Test.jsp");

     // request.getRequestDispatcher("/AddCart.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
