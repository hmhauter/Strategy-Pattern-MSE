import java.util.Random;

public class NOxSensor{
	
	public int testresult;
	
	public NOxSensor() {
		this.generatenum();
	}
	public void generatenum() {
		Random rand = new Random();
		int max = 400;
		int min = 200;
		int randomNum = rand.nextInt((max - min) + 1) + min;
		this.testresult = randomNum;
	}

}
