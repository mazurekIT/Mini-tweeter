package pl.coderslab.filtr;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest; //rozszerzenie metod dla request
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse; //rozszerzenie metod dla request

        Boolean loggedIn = (Boolean) httpServletRequest.getSession(true).getAttribute("loggedIn");

        if (loggedIn!=null&&loggedIn){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            httpServletResponse.sendRedirect("/login");
        }

    }

    @Override
    public void destroy() {

    }
}
