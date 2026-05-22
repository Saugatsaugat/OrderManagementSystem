package com.saugat.oms.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

// TODO: UserId to be fetched from the saved data after successful  login

@Component
public class RequestIDFilter extends OncePerRequestFilter {

    private static final String HEADER = "X-Request-Id";
    private static final String MDC_REQUEST_ID_KEY = "requestId";
    private static final String MDC_USER_ID_KEY = "userId";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestId = request.getHeader(HEADER);
        String userId = MDC.get(MDC_REQUEST_ID_KEY);

        if(requestId == null || requestId.isBlank()){
            requestId = UUID.randomUUID().toString();
        }

        if(userId == null || userId.isBlank() || userId.isEmpty()){
//            TODO
//            userId = className.getUserId();
            MDC.put(MDC_USER_ID_KEY, userId);
        }

        MDC.put(MDC_REQUEST_ID_KEY, requestId);
        response.setHeader(HEADER, requestId);

        try{
            filterChain.doFilter(request, response);
        }finally{
            MDC.clear();
        }

    }
}