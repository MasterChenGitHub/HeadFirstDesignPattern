package singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static volatile ChocolateBoiler sInstance = null;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (sInstance == null) {

			synchronized (ChocolateBoiler.class) {

				if (sInstance == null) {
					sInstance = new ChocolateBoiler();
				}

			}

		}

		return sInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;

		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
