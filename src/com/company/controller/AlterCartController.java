package com.company.controller;

import com.company.entity.Carts;
import com.company.entity.G_detail;
import com.company.service.CartsService;
import com.company.service.G_detailService;
import com.company.service.serviceimpl.CartsServiceimpl;
import com.company.service.serviceimpl.G_detailServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AlterCartController",value = "/user/safe/alterCart")
public class AlterCartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      G_detailService gs = new G_detailServiceimpl();
      CartsService cs = new CartsServiceimpl();
      String spid = request.getParameter("spid");
      Carts carts = cs.checkCartById(Integer.valueOf(spid));
      G_detail g_detail = gs.queryById(carts.getG_did());
      request.setAttribute("cart",carts);
      request.setAttribute("g_detail",g_detail);
      request.getRequestDispatcher("/ModifyCart.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
