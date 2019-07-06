package com.imooc.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * //匹配任何公共方法
 @Pointcut("execution(public * com.imooc.service.*.*(..))")

 //匹配com.imooc包及子包下Service类中无参方法
 @Pointcut("execution(* com.imooc..*Service.*())")

 //匹配com.imooc包及子包下Service类中的任何只有一个参数的方法
 @Pointcut("execution(* com.imooc..*Service.*(*))")

 //匹配com.imooc包及子包下任何类的任何方法
 @Pointcut("execution(* com.imooc..*.*(..))")

 //匹配com.imooc包及子包下Product类的任何方法
 @Pointcut("execution(* com.imooc..Product.*(..))")

 //匹配com.imooc包及子包下返回值为String的任何方法
 @Pointcut("execution(String com.imooc..*.*(..))")

 //匹配异常
 execution(public * com.imooc.service.*.*(..) throws java.lang.IllegalAccessException)

 * Created by cat on 2017-02-19.
 */
//@Aspect
@Component
public class ExecutionAspectConfig {                            //
                                                                //throws java.lang.IllegalAccessException
  @Pointcut("execution(public * com.imooc.service..*.*(..) )")
  public void matchCondition(){}

  //  @Before("matchCondition()")           //前置通知
    public void before(JoinPoint point){
        System.out.println(point.getKind());

        Object[] args = point.getArgs();


        System.out.println("前置通知执行！");
    }

  //  @AfterReturning("matchCondition()")
    public void afterReturing(){    //后置通知
        System.out.println("后置通知执！");
    }


  // @AfterThrowing("matchCondition()")
    public void throwing(JoinPoint point){      //异常通知

        System.out.println("异常通知执行！");
    }

  //  @After("matchCondition()")        //最终通知
    public void after(JoinPoint point){

      System.out.println("最终通知执行！");
    }

    @Around("matchCondition()")     //环绕通知               开发中最好用环绕通知，其他通知有顺序调用问题
    public Object around(ProceedingJoinPoint point) {        //环绕通知 使用 ProceedingJoinPoint  其他通知使用  JoinPoint

        try{
            System.out.println("环绕前置通知执行了！");
            Object proceed = point.proceed();
            System.out.println("环绕后置通知执行了");
            return proceed;
        }catch (Throwable e){
            System.out.println("环绕异常通知执行了");
            throw new RuntimeException();
        }finally {
            System.out.println("环绕最终通知执行了");
        }



    }
}
