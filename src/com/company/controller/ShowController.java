package com.company.controller;

import com.company.entity.Goods;
import com.company.entity.Page;
import com.company.service.GoodsService;
import com.company.service.serviceimpl.GoodsServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowController",value ="/user/show")
public class ShowController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      GoodsService gs = new GoodsServiceimpl();
      String pageIndex = request.getParameter("pageIndex");
      if(pageIndex == null){
        pageIndex = "1";
      }
      Page page = new Page(Integer.valueOf(pageIndex));
      page.setTotalRow((int)gs.totalRowByGoods());
      request.setAttribute("page",page);
      List<Goods> goods = gs.showAlllim(page);
      HttpSession session = request.getSession();
      session.setAttribute("goods",goods);
      request.getRequestDispatcher("/Test.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
    }
}
