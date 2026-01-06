package lab_A;
import apis.Scooter;


public class Brad_18 {

	public static void main(String[] args) {
	    Scooter s1 = new Scooter();
	    System.out.println("---");
	    s1.upSpeed(); s1.upSpeed(); s1.upSpeed();
	    s1.upSpeed(); s1.downSpeed();
	    System.out.println(s1.getSpeed());
	    s1.setGear(2);
	    s1.upSpeed(); s1.upSpeed();
	    System.out.println(s1.getSpeed());
	    System.out.println(s1.getColor());
	    Scooter s2 = new Scooter("Red");
	    System.out.println(s2.getColor());
	}
}
