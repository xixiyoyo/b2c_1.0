package com.company.filter;

import com.company.entity.Users;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(value = "/user/safe/*")
public class CheckUserFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    HttpSession session = request.getSession();
    Users user = (Users) session.getAttribute("user");
    if(user != null){
      filterChain.doFilter(request,response);
    }else {
      response.sendRedirect(request.getContextPath()+"/user/login");
    }
  }

  @Override
  public void destroy() {

  }
}
