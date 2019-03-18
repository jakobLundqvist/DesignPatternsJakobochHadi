import javafx.scene.paint.Color;

public class Scania extends Car {

	private int flatbedAngle;

	public Scania() {
		super(800, Color.WHITE, "Scania");
		flatbedAngle = 0;
		stopEngine();
	}

	
	
	public double speedFactor() {
		return getEnginePower() * 0.005;
	}

	/**
	 * Höjer flaket 10 grader
	 */
	public void raiseFlatbed() {
		if (getCurrentSpeed() > 0)
			return;

		flatbedAngle += 10;
		if (flatbedAngle > 70)
			flatbedAngle = 70;
	}

	/**
	 * Sänker  flaket 10 grader
	 */
	public void lowerFlatbed() {
		flatbedAngle -= 10;
		if (flatbedAngle < 0)
			flatbedAngle = 0;
	}

	@Override
	public void gas(double amount) {
		if (flatbedAngle == 0)
			super.gas(amount);
	}

}
