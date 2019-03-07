package com.aisa.sate;

public class Manager extends emplyee{

    private double bonus;

    @Override      //覆盖，重写： 只能发生在父子类中，即继承中
    //子类里的方法与父亲的方法名，参数，返回值都相同
    //访问权限相同或更宽松，就称为重写或覆盖
    //为什么重写？ 对父类中的方法内容不满意
    public double getSalary() {
        return getSalary() + bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
