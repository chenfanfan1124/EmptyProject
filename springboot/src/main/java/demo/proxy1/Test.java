package demo.proxy1;

public class Test {

    @org.junit.Test
    public void demo1(){
        Dog bz =new BaoZi();
        ProxyFactoy pf =new ProxyFactoy();
        Object dog = pf.bind(bz);
        Dog gou =(Dog)dog;
        String str = gou.eatBounds(10);
        System.out.println(str);

        Tom tom =new Tom();
        Object tt = pf.bind(tom);
        Cat _tom = (Cat)tt;
        _tom.eatHat(15);

    }

    @org.junit.Test
    public void demo2(){
        Cat bz =new BaoZi();
        ProxyFactoy pf =new ProxyFactoy();
        Object dog = pf.bind(bz);
        Cat mao =(Cat)dog;
        String str = mao.eatHat(20);
        System.out.println(str);



    }
}
