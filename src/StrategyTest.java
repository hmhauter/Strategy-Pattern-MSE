
public class StrategyTest implements Strategy{
	
	// gibt Messwert des Sensors wieder und modifiziert ihn
	@Override
	public int getdata(NOxSensor sensor) {
		System.out.println("TEST"); //fyi
		sensor.generatenum();
		System.out.printf("Eigentlicher Wert: " + sensor.testresult + "\n"); //fyi
		if (sensor.testresult >= 300) { //Werte werden modifiziert
			return sensor.testresult-100;
		}
		return sensor.testresult;
	}

}
