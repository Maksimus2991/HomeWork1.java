package lesson6;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getPower() {
        return power;
    }
    public boolean fight(Robot anotherRobot)
    {
        if(this.power > anotherRobot.power)
        {
            return true;
        }
        else return false;
    }
}
