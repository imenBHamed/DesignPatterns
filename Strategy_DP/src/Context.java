
public class Context {
	private Strategy strategy;
	
	public void appliquerStrategy() {
		strategy.methodStrategy();
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	

}
