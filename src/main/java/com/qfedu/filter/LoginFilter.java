package com.qfedu.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 鲁帅 on 2019/6/20.
 */
//@WebFilter("/*")
public class LoginFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String uri = request.getRequestURI();
        if(uri.contains("login")||uri.contains("register")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            String token = servletRequest.getParameter("token");
            String webToken = (String) servletRequest.getServletContext().getAttribute(token);
            if (webToken != null && !webToken.isEmpty()) {
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                servletResponse.setContentType("text/html;charset=utf-8");
                servletResponse.getWriter().write("{\"code\":0, \"info\":\"token不存在\"}");
                return;
            }
        }
    }

    @Override
    public void destroy() {

    }
}
