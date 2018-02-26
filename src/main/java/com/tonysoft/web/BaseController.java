package com.tonysoft.web;

import com.tonysoft.entity.BasicMsg;
import com.tonysoft.util.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 王绪 on 2017/9/6.
 * Email Damier1986@outlook.com
 */
public class BaseController {

    @ExceptionHandler
    @ResponseBody
    public BasicMsg exp(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //String resultViewName = "errors/error";
        if (!(ex instanceof BusinessException)) {
            ex = new Exception(ex.getMessage());
        }
        BasicMsg basicMsg = new BasicMsg();
        basicMsg.setErrMsg(ex.getMessage());
        basicMsg.setOpState(false);
        basicMsg.setRows(0);
        return basicMsg;

    }
}
