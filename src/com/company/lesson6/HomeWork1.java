package lesson6;

public class HomeWork1 {
    public static void main(String[] args) {
Robot robot1 = new Robot("Bin", 5, 6);
Robot robot2 = new Robot("Bak", 4, 5);
        if(robot1.fight(robot2))
            System.out.println("Bak - proigral");
        else
            System.out.println("Bik - proigral");
    }

}
