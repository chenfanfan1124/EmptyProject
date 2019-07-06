package demo.anntation;



import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@MyAnnotation(value = "97nimei",name = "zhangsan",age =10)
@MyAnnotation2({"hlleo","world"})
public class Persion extends Father{

    public void test1(){
        test2();
    }

    @Deprecated         // Deprecated 废弃，遗弃
    public void test2(){

    }
    //Suppress 压制，抑制 镇压
 //   @SuppressWarnings(value = {"rawtypes","unuserd"} )   //rawtypes 忽略泛型警告，   unuserd 变量未被使用警告
    @SuppressWarnings( {"all"})   //value 可省        all所有警告
    public void test3(){
        List list =new ArrayList();
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = Persion.class;
        Annotation[] annotations =  clazz.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }
    }
}
