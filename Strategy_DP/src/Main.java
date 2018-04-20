
public class Main {

	public static void main(String[] args) {

		Context context = new Context();
		context.setStrategy(new TypeStrategy1());
		context.appliquerStrategy();
		context.setStrategy(new TypeStrategy2());
		context.appliquerStrategy();
		context.setStrategy(new TypeStrategy3());
		context.appliquerStrategy();

	}

}
