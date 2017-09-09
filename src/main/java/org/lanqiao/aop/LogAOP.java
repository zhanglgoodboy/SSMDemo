package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by isyou on 2017/9/6.
 */
public class LogAOP {
    Logger logger= Logger.getLogger(LogAOP.class);
    //  要记录的日志内容
    String strLog=null;
    //前置通知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入前置通知");
        //joinPoint.getTarget().getClass().getName() 获取执行方法的类名
        //joinPoint.getSignature().getName()         获取执行的方法名
        strLog="log Begining method:"
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入了后置通知");
        //joinPoint.getTarget().getClass().getName() 获取执行方法的类名
        //joinPoint.getSignature().getName()         获取执行的方法名
        strLog="log After method:"
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //环绕通知
    public void somethingAround(JoinPoint joinPoint){

    }

}
