package apis;


public class Bike {
//	腳踏車speed	
	
	protected double speed;

	public void upSpeed() {
        speed = speed < 1 ? 1 : speed * 1.3;
	}
	
	void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}
	public double getSpeed() {
		return speed;
	}
}
	