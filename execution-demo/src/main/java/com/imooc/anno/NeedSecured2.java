package com.imooc.anno;

import java.lang.annotation.*;

/**
 * Created by cat on 2016-12-04.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
public @interface NeedSecured2 {
}
