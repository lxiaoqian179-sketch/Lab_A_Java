package apis;
//目前已經做到的
//1	正確使用 extends
//2	理解 protected 與 private
//3	正確區分 override / overload
//4	有實際「行為差異」而不是形式繼承
//5	有防呆思維


public class Scooter extends Bike {
	// Scooter 是 Bike 的子類別
	// 繼承 Bike 的屬性與方法
	// 擴充 自己特有的功能（gear、多種 upSpeed）

	private int gear;
	// gear：代表檔位
	
	private String color;
	
	public Scooter() {
		System.out.println("Scooter()");
		color = "Blue";//顏色_初始化
	}
		
	public Scooter(String color){
		this.color = color;
	}	
		
	
	public String getColor() { return color ; }
	
	

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.8 * gear;
	}
	// 覆寫（override）父類別 Bike 的 upSpeed()
	
	

	// Overload
	public void upSpeed(int level) {
		speed = speed < 1 ? 1 : speed * 1.8 * level;
	}

//    public void upSpeedV2() {
//        speed = speed < 1 ? 1 : speed * 1.8 * gear;
//    }

	public void setGear(int gear) {
		if (gear >= 0 && gear <= 4) {
			this.gear = gear;
		}
		//防呆 setter
	}

	public int getGear() {
		return gear;
	}
	//（標準 getter）
}

