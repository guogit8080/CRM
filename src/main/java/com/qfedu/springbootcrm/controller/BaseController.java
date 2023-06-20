package com.qfedu.springbootcrm.controller;

import com.qfedu.springbootcrm.service.ex.*;
import com.qfedu.springbootcrm.util.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {


    //统一异常的处理
    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Void> handleException(Throwable e){
        ResponseResult<Void> responseResult = null ;
        if(e instanceof UsernameDuplicateException){
            responseResult = ResponseResult.getResponseResult(4000,"用户名被占用") ;
        }else if(e instanceof UserNotFoundException){
            responseResult = ResponseResult.getResponseResult(4001,"用户数据不存在");
        }else if(e instanceof PasswordNotFoundException){
            responseResult = ResponseResult.getResponseResult(4002 , "密码验证失败");
        }else if(e instanceof InsertException){
            responseResult = ResponseResult.getResponseResult(5000 , "插入数据产生未知异常");
        }else if(e instanceof ListNotFoundException){
            responseResult = ResponseResult.getResponseResult(5001 , "数据为空的异常");
        }
        return responseResult ;
    }
}
