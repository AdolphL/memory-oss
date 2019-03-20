package com.adolph.memory.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 *
 * @author adolph liu
 * 2019-3-20 19:17:29
 */
@Component
public class RequestLogInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(RequestLogInterceptor.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        StringBuffer reqInfo = new StringBuffer("url:");
        reqInfo.append(request.getRequestURL()).append("\r\n").append("headers:").append("\r\n");//headers

        Enumeration<String> headers = request.getHeaderNames();
        while(headers.hasMoreElements()) {
            String headerName = headers.nextElement();
            reqInfo.append(headerName).append(":")
                    .append(Arrays.toString(new Enumeration[]{request.getHeaders(headerName)}))
                    .append("\r\n");
        }

        reqInfo.append("parameter").append("\r\n"); //parameter

        request.getParameterMap().forEach((k,v) -> { reqInfo.append(k).append(":").append(Arrays.toString(v)).append("\r\n"); });
        //---------------------- response log ---------------------------
        reqInfo.append("response:").append(response.getStatus()).append("\r\n")
        .append("headers:").append("\r\n");

        for (String headerName : response.getHeaderNames()) {
            reqInfo.append(headerName).append(":").append(response.getHeader(headerName));
        }

        logger.info(reqInfo.toString());

        super.postHandle(request, response, handler, modelAndView);
    }

}
