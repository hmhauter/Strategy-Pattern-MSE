import java.util.LinkedList;

public class EngineController {
	
	private NOxSensor sensor = new NOxSensor();
	private LinkedList<Strategy> strategies = new LinkedList<Strategy>();
	
	// Constructor, beide Strategien werden erzeugt und zur Liste hinzugefügt
	public EngineController() {
		strategies.add(new StrategyRoad());
		strategies.add(new StrategyTest());
	}
	
	// ruft Methode der gewählten Strategie auf
	public void getNOx(Strategy strategy) {
		System.out.println(strategy.getdata(sensor));
	}
	
	// gibt Strategie zurück; Test Kit ist verbunden
	public Strategy connectTestKit() {
		return strategies.get(1);
	}
	
	// gibt Strategie zurück; Auto fährt ohne Testmessung
	public Strategy ontheroad() {
		return strategies.get(0);
	}
}