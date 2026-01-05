package lab_A;

public class Bike {
//	腳踏車speed	
	
	private double speed;

	void upSpeed() {
        speed = speed < 1 ? 1 : speed * 1.3;
	}
	
	void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.5;
	}
	public double getSpeed() {
		return speed;
	}
	
	
	
	
}
