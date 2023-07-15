package com.qf.resolver;

import com.qf.exception.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//处理器
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        if(ex instanceof CustomException){
            CustomException customException = (CustomException) ex;
            String message = customException.getMessage();
            mav.addObject("message",message);
        }else {
            String message = ex.getMessage();
            mav.addObject("message",message);
        }
        return mav;
    }
}
