package xyz.luvily.lightningserver.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CapeControllerFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpRequest, HttpServletResponse httpResponse, FilterChain filterChain) throws IOException, ServletException {
        httpResponse.addHeader("Server", "LightningServer 0.1 (Spring Boot)");
        httpResponse.addHeader("Connection", "Keep-Alive");
        httpResponse.addHeader("Accept", "image/jpeg, image/png");
        httpResponse.addHeader("Accept-Ranges", "bytes");

        filterChain.doFilter(httpRequest, httpResponse);
    }
}