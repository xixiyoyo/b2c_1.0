package com.company.controller;

import com.company.entity.G_detail;
import com.company.service.G_detailService;
import com.company.service.serviceimpl.G_detailServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "G_detailController",value = "/user/g_detail")
public class G_detailController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      G_detailService gs = new G_detailServiceimpl();
      String gid = request.getParameter("gid");
      List<G_detail> list = gs.showById(Integer.valueOf(gid));
      if(list != null){
        request.setAttribute("g_delist",list);
        request.getRequestDispatcher("/G_details.jsp").forward(request,response);
      }else {
        response.sendRedirect(request.getContextPath()+"/Test.jsp");
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
