package com.study.advice;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 35612
 */
@RestControllerAdvice
public class HandlerControllerException {

    @ExceptionHandler(RuntimeException.class)
    public String  handlerException(RuntimeException e){
        if (e instanceof AccessDeniedException){
            return "redirect:403.jsp";
        }else {
            return "forward:500.jsp";
        }
    }
}
