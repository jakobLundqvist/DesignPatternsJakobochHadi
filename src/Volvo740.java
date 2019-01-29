import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	private final static double trimFactor = 1.25;

	public Volvo740() {
		super(100, Color.RED, "Volvo740");
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}

}