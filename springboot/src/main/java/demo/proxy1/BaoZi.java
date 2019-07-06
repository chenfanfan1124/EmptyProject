package demo.proxy1;

public class BaoZi implements Dog,Cat {
    @Override
    public String eatHat(Integer in) {
        System.out.println("猫吃耗子");
        return "一共吃了"+in+"只耗子";
    }

    @Override
    public String eatBounds(Integer in) {
        System.out.println("狗子骨头");
        return "一共吃了"+in+"个骨头";
    }
}
