package com.imooc.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * //匹配方法标注有AdminOnly的注解的方法
 * @Pointcut("@annotation(com.imooc.anno.AdminOnly) && within(com.imooc..*)")
 * //匹配标注有NeedSecured的类底下的方法 //class级别
 * @Pointcut("@within(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * //匹配标注有NeedSecured的类及其子类的方法 //runtime级别
 * 在spring context的环境下,二者没有区别
 * @Pointcut("@target(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * //匹配传入的参数类标注有Repository注解的方法
 * @Pointcut("@args(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 * Created by cat on 2016-12-04.
 */
@Aspect
@Component
public class AnnoAspectConfig2 {

    @Pointcut("@annotation(com.imooc.anno.NeedSecured2) || @within(com.imooc.anno.NeedSecured2)")
 //   @Pointcut("@annotation(com.imooc.anno.NeedSecured) && within(com.imooc..*)")
 //  @Pointcut("@within(com.imooc.anno.NeedSecured)")
  //   @Pointcut("@args(com.imooc.anno.NeedSecured)")
    public void matchAnno(){}

   // @Before("matchAnno()")
    public void before(){
        System.out.println("前置方法执行了");
    }

    @Around("matchAnno()")
    public Object Around(ProceedingJoinPoint point){

        try{
            System.out.println("环绕前置通知执行了2！");
            Object proceed = point.proceed();
            System.out.println("环绕后置通知执行了2");
            return proceed;
        }catch (Throwable e){
            System.out.println("环绕异常通知执行了2");
            throw new RuntimeException();
        }finally {
            System.out.println("环绕最终通知执行了2");
        }

    }
}
