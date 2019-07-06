package cn.inlee.dataSourceAspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据源切换注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DS {

    public static final String dataSourceProvider = "dataSourceProvider";
    public static final String dataSourceConsumer = "dataSourceConsumer";
    String value() default "dataSourceDefault";
}


