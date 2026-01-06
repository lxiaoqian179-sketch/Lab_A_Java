package lab_A;

import apis.Bike;

public class Brad_17 {

    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();

        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(bike1.getSpeed());
        System.out.println(bike2.getSpeed());

        bike1.upSpeed();
        bike1.upSpeed();
        bike1.upSpeed();
        bike1.upSpeed();

        System.out.println(bike1.getSpeed());
        System.out.println(bike2.getSpeed());

        System.out.println(bike2.getSpeed());
    }
}
