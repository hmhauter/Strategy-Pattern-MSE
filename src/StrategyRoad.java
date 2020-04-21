
public class StrategyRoad implements Strategy {
	
	// gibt Messwert des Sensors wieder
	@Override
	public int getdata(NOxSensor sensor) {
		System.out.println("ROAD"); //fyi
		sensor.generatenum();
		return sensor.testresult ;
	}

}
