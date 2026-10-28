package Bai2;

import ss4_class.Fan;

public class MainFan {
    public static void main(String[] args) {
        ss4_class.Fan fan = new ss4_class.Fan();
        fan.setOn(true);
        fan.setSpeed(Fan.FAST);
        System.out.println(fan.toString());
        System.out.println(fan.getColor());
        System.out.println(fan.getRadius());
        System.out.println(fan.getSpeed());
    }
}
