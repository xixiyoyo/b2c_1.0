package com.company.controller;

import com.company.entity.Address;
import com.company.entity.Users;
import com.company.service.AddressService;
import com.company.service.serviceimpl.AddressServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddAdd2Controller",value = "/user/safe/addadd2")
public class AddAdd2Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      AddressService as = new AddressServiceimpl();
      HttpSession session = request.getSession();
      Users user = (Users) session.getAttribute("user");
      String aname = request.getParameter("aname");
      String phonenum = request.getParameter("phonenum");
      String province = request.getParameter("province");
      String city = request.getParameter("city");
      String town = request.getParameter("town");
      String a_detail = request.getParameter("a_detail");
      Address address = new Address(user.getUid(),aname,phonenum,province,city,town,a_detail);
      int i = as.addAdress(address);
      List<Address> addressList = as.checkAddressByUid(user.getUid());
      request.setAttribute("addressList",addressList);
      request.getRequestDispatcher("/AddOrder.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
