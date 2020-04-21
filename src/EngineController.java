import java.util.LinkedList;

public class EngineController {
	
	private NOxSensor sensor = new NOxSensor();
	private LinkedList<Strategy> strategies = new LinkedList<Strategy>();
	
	// Constructor, beide Strategien werden erzeugt und zur Liste hinzugef�gt
	public EngineController() {
		strategies.add(new StrategyRoad());
		strategies.add(new StrategyTest());
	}
	
	// ruft Methode der gew�hlten Strategie auf
	public void getNOx(Strategy strategy) {
		System.out.println(strategy.getdata(sensor));
	}
	
	// gibt Strategie zur�ck; Test Kit ist verbunden
	public Strategy connectTestKit() {
		return strategies.get(1);
	}
	
	// gibt Strategie zur�ck; Auto f�hrt ohne Testmessung
	public Strategy ontheroad() {
		return strategies.get(0);
	}
}