package com.aisa.sate;

public class zi extends Fu{
    private String z;

    public zi() {
        super();//子类构造器中如果没有用this（）来调本类的其余构造器
        //就会自动被加入super（）；这句话的意思是调用父类无参数构造器
        //super（）必须出现在构造器的第一行
        System.out.println("zi:" + z);
    }

    public zi(String f) {
        super(f); //调用父亲一个带String参数的构造器
        this.z = z;
        System.out.println("zi:" + z);
    }

    @Override
    public String toString() {
        return "zi{" +
                "z=" + z +
                '}';
    }
}
