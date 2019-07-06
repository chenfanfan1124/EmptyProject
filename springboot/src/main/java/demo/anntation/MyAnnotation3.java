package demo.anntation;

import java.lang.annotation.*;

/**
 *  元注解(meta-annotation) 就是修饰注解的注解，就是给你自己定义的注解添加注解,Java5.0定义了4个标准的meta-annotation类型
 *
 *  1. @Target 说明注解的可使用范围（例 包上，类上，方法上，成员变量,局部变量，构造器等）
 *  枚举 ElementType  包含了可使用范围的值
          1.CONSTRUCTOR:用于描述构造器
          2.FIELD:用于描述域
          3.LOCAL_VARIABLE:用于描述局部变量
          4.METHOD:用于描述方法
          5.PACKAGE:用于描述包
          6.PARAMETER:用于描述参数
          7.TYPE:用于描述类、接口(包括注解类型) 或enum声明

     2.@Retention 定义了该Annotation被保留的时间长短
      枚举 RetentionPoicy 包含了可使用范围
          1.SOURCE:在源文件中有效（即源文件保留）
          2.CLASS:在class文件中有效（即class保留）
          3.RUNTIME:在运行时有效（即运行时保留,只有注解信息在运行时保存，我们才可以通过反射操作来读取注解信息）

     3.@Documented  用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，
                    因此可以被例如javadoc此类的工具文档化。Documented是一个标记注解，没有成员。

 *   4. @Inherited
 * @Inherited 元注解是一个标记注解，@Inherited阐述了某个被标注的类型是被继承的。
 * 如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类。
 */

@Target({ElementType.TYPE,ElementType.METHOD})         //Target 目标
@Retention(RetentionPolicy.RUNTIME)                    //Retention 保留
@Inherited
public @interface MyAnnotation3 {

     String[] value() default "";
     String name() default "zhangsan";
}
