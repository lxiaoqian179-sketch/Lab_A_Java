package lab_A;

public class Brad_17 {
//	腳踏車speed

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();

		System.out.println(bike1);
		System.out.println(bike2);
		System.out.println(bike1.speed);
		System.out.println(bike2.speed);

		bike1.upSpeed();
		bike1.upSpeed();
		bike1.upSpeed();
		bike1.upSpeed();

		System.out.println(bike1.speed);
		System.out.println(bike2.speed);
	}
}