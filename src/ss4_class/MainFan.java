package ss4_class;

public class MainFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setSpeed(Fan.FAST);
        System.out.println(fan.toString());
        System.out.println(fan.getColor());
        System.out.println(fan.getRadius());
        System.out.println(fan.getSpeed());
    }
}
