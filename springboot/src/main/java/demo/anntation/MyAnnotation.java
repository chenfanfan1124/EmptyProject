package demo.anntation;


import java.lang.annotation.Inherited;

@Inherited
public @interface MyAnnotation {

     String name();     //这是声明属性       当在属性中声明了属性时，其他该使用该注解时，必须赋值

     int age();

     String  address() default "大三汇";    //当使用了默认值后，其他该使用该注解时，就可以不用赋值

    String value();
}
