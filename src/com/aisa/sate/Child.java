package com.aisa.sate;

//public void foo(int i, double d){}
//public int foo(double d, int i){return 0;}

public class Child extends Base {
    public Child() {
        super();
    }

    public  void  foo(){ //重载
    }

    public  void foo(int i, double d){ //重写
    }
}
