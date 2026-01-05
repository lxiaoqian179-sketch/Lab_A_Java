package lab_A;

public class Bike {
    double speed;

    void upSpeed() {
        speed = speed < 1 ? 1 : speed * 1.2;
    }
}
