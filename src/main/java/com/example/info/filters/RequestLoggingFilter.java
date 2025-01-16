package com.example.info.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class RequestLoggingFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        LOG.info("Logging Request  {} : {}", req.getMethod(), req.getRequestURI());

        chain.doFilter(request, response);

        LOG.info("Logging Response :{}", res.getContentType());
    }
}
