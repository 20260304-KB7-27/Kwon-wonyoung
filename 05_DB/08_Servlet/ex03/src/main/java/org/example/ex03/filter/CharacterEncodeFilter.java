package org.example.ex03.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/*
* Filter
* - 클라이언트 요청이 Servlet/JSP에 도착하기 전 /응답이 나가기 전에 공통 처리를 할 수 있는 컴포넌트
* */
@WebFilter(urlPatterns = {"/*"})
public class CharaterEncodeFilter implements Filter {

    // filter가 생성될 때
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    // 서버 종료될 때
    @Override
    public void destroy() {}

    //
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Servlet 호출 전(전처리)
        System.out.println("필터 동작 시작");

        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response); // 다음 필터 또는 Servlet으로 요청 전달

        // 클라이언트 응답하기 전 (후처리)
        System.out.println("필터 동작 끝");
    }
}
