package apis;

public class Scooter_A extends Bike{

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.8;
	}
	
}