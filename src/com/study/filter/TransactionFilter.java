package com.study.filter;

import com.study.utils.JdbcUtils;

import javax.servlet.*;
import java.io.IOException;

public class TransactionFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req,resp);
        JdbcUtils.commitAndClose();
        JdbcUtils.rollbackAndClose();


    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
