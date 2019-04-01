package model;
import javafx.scene.paint.Color;

public class Scania extends Car {

	private Flatbed flatbed;

	public Scania() {
		super(800, Color.WHITE, "Scania");
		flatbed = new Flatbed();
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.005;
	}

	/**
	 * Höjer flaket 10 grader
	 */
	public void raiseFlatbed() {
		if (getCurrentSpeed() == 0)
			flatbed.raiseFlatbed();
	}

	/**
	 * Sänker flaket 10 grader
	 */
	public void lowerFlatbed() {
		if (getCurrentSpeed() == 0)
			flatbed.lowerFlatbed();
	}

	@Override
	public void gas(double amount) {
		if (flatbed.getAngle() == 0)
			super.gas(amount);
	}

}
