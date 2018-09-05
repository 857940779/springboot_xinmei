package com.luohw.springboot.filter;

import com.luohw.springboot.constant.TokenConstant;

import javax.servlet.*;
import java.io.IOException;

public class InitFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //初始化时，需要获取token
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
