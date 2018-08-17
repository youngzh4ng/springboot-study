package com.test.springboot.filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
public class TestAgainFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("Now Test Filter Init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Now Filtering in Test Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Now Test Filter Destroy");
    }
}
