package demo.proxy1;

public class Tom implements Cat {
    @Override
    public String eatHat(Integer in) {
        System.out.println("这是一个单纯的猫");
        return in+"";
    }
}
