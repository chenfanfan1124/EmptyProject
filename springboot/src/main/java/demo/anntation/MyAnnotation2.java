package demo.anntation;



public @interface MyAnnotation2 {

     String[] value();      //当其他类使用注解时，如果只给value值一个属性赋值，属性名可省略
     String name() default "zhangsan";
}
